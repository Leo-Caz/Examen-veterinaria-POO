package pkVeterinaria;

import java.util.List;
import pkVeterinaria.pkFinanza.BienestarAnimal;
import pkVeterinaria.pkFinanza.DataFast;
import pkVeterinaria.pkHumano.Propietario;
import pkVeterinaria.pkHumano.Veterinario;
import pkVeterinaria.pkReinoViviente.pkAnimal.Ave.Loro;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Conejo;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Lobo;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Ecosistema.ControllerRio;
import pkVeterinaria.pkReinoViviente.pkAnimal.Pez.PezPayaso;
import pkVeterinaria.pkReinoViviente.pkAnimal.ReinoAnimal;
import pkVeterinaria.pkReinoViviente.pkAnimal.Reptil.Cocodrilo;

public class AppVeterinaria {
    private String log;
    private String pass;

    public AppVeterinaria() {
        setLog("usrVet");
        setPass("passVet");
    }

    public void iniciarMundoAnimal() {
        Propietario propietario = new Propietario("1734537890", "Atena", "Santana");
        Veterinario veterinario = new Veterinario("187654321", "Grupo 1", "Veterinaria");
        Lobo lobo = new Lobo("Rocky");
        Loro loro = new Loro("Plumas");
        Cocodrilo serpiente = new Cocodrilo("Sombra");
        PezPayaso pezPayaso = new PezPayaso("Nemo");
        DataFast dataFast = new DataFast();

   
        if (!veterinario.setClave("usrVet", "passVet")) {
            System.out.println("No se pudo establecer la clave del veterinario.");
            return;
        }
        

        System.out.println("\n--- caso de uso: REQ 02 ---");
        ControllerRio controller = new ControllerRio();
        List<Conejo> lstHeridos = controller.animalesRio();

        if (lstHeridos != null && !lstHeridos.isEmpty()) {
    
            System.out.println("\n--- caso de uso: REQ 01 (registro) ---");
            for (Conejo c : lstHeridos) {
                registrar(c);  
            }

            System.out.println("\n--- caso de uso: REQ 04 (Veterinario) ---");
            for (Conejo c : lstHeridos) {
                veterinario.curar(c);
            }
        } else {
            System.out.println("\nNo hubo heridos provenientes del accidente.");
        }

        System.out.println("\n--- caso de uso: REQ 03 ---");
        BienestarAnimal bienestar = new BienestarAnimal("Bienestar Animal");
        bienestar.cobrarConsultaEmergencia(lstHeridos, 30.0, true);
        System.out.println("FIN");
    
        if (ingresar(veterinario)) {
            System.out.println("Acceso concedido. Bienvenido, " + veterinario.getNombre() + ".");


            System.out.println("\n--- caso de uso: REQ 01 ---");
            registrar(lobo);
            registrar(loro);
            registrar(serpiente);
            registrar(pezPayaso);

            System.out.println("\n--- caso de uso: REQ 04 ---");
            veterinario.curar(lobo);
            veterinario.curar(loro);
            veterinario.curar(serpiente);
            veterinario.curar(pezPayaso);

            System.out.println("\n--- caso de uso: REQ 05 ---");
            lobo.comer();
            lobo.aullarLoro(loro);
            loro.comer();
            loro.hablarA(serpiente);
            serpiente.comer();
            serpiente.sisearA(pezPayaso);
            pezPayaso.comer();
            pezPayaso.nadarAlrededorDe(lobo);

            System.out.println("\n--- caso de uso: REQ 04 ---");
            dataFast.procesarCobro(lobo, 25.0, 12.5);
            dataFast.procesarCobro(loro, 18.0, 6.0);
            dataFast.procesarCobro(serpiente, 22.0, 9.5);
            dataFast.procesarCobro(pezPayaso, 15.0, 8.0);
            dataFast.imprimirResumen();
        } else {
            System.out.println("Acceso denegado. Credenciales incorrectas.");
        }
    }

    private boolean ingresar(Veterinario usuario) {
        if (usuario == null) {
            return false;
        }
        String login = usuario.getLogin();
        String password = usuario.getPassword();
        if (login == null || password == null) {
            return false;
        }
        return login.equals(getLog()) && password.equals(getPass());
    }

    private boolean registrar(ReinoAnimal animal) {
        if (animal == null) {
            return false;
        }
        System.out.println("Registrando animal: " + animal.getNombre());
        return true;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
