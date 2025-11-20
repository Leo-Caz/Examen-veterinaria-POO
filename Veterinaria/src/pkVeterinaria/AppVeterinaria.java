package pkVeterinaria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pkVeterinaria.pkFinanza.BienestarAnimal;
import pkVeterinaria.pkFinanza.DataFast;
import pkVeterinaria.pkHumano.Propietario;
import pkVeterinaria.pkHumano.Veterinario;
import pkVeterinaria.pkReinoViviente.pkAnimal.Ave.Canario;
import pkVeterinaria.pkReinoViviente.pkAnimal.Ave.Loro;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Conejo;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.ControllerRio;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Lobo;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Nutria;
import pkVeterinaria.pkReinoViviente.pkAnimal.Pez.PezCirujanoAzul;
import pkVeterinaria.pkReinoViviente.pkAnimal.Pez.PezPayaso;
import pkVeterinaria.pkReinoViviente.pkAnimal.ReinoAnimal;
import pkVeterinaria.pkReinoViviente.pkAnimal.Reptil.Cocodrilo;
import pkVeterinaria.pkReinoViviente.pkAnimal.Reptil.Serpiente;

public class AppVeterinaria {

    public void iniciarMundoAnimal() {
        Veterinario veterinario = new Veterinario("1104589623", "Valentina", "Ibarra");
        Propietario cliente = new Propietario("0952147856", "Mateo", "Lagos");

        Loro loro = new Loro("Plumas");
        Canario canarioPaciente = new Canario("Aurora");
        Canario canarioTravieso = new Canario("Sol");
        Conejo conejo = new Conejo("Copito");
        Lobo lobo = new Lobo("Lobo Feroz");
        Nutria nutria = new Nutria("Olivia");
        Cocodrilo cocodrilo = new Cocodrilo("Sombra");
        Serpiente serpiente = new Serpiente("Kaa", "ratones");
        PezPayaso pezPayaso = new PezPayaso("Marlin");
        PezCirujanoAzul pezCirujano = new PezCirujanoAzul("Dory");
        DataFast dataFast = new DataFast();

        imprimirCreacion(
            veterinario,
            cliente,
            loro,
            canarioPaciente,
            canarioTravieso,
            conejo,
            lobo,
            nutria,
            cocodrilo,
            serpiente,
            pezPayaso,
            pezCirujano
        );
        ejecutarRegistro(
            veterinario,
            Arrays.asList(loro, canarioPaciente, conejo, lobo, nutria, cocodrilo, serpiente, pezPayaso, pezCirujano)
        );

        System.out.println("\n--- caso de uso: REQ 03 ---");
        escenaCanarioYLoro(canarioTravieso, loro);
        System.out.println("\n--- caso de uso: REQ 04 ---");
        escenaReptil(cocodrilo, serpiente);
        System.out.println("\n--- caso de uso: REQ 05 ---");
        escenaPez(pezPayaso, pezCirujano);

        ejecutarCuraciones(
            veterinario,
            loro,
            canarioPaciente,
            conejo,
            lobo,
            nutria,
            cocodrilo,
            serpiente,
            pezPayaso,
            pezCirujano
        );
        ejecutarPagos(
            cliente,
            dataFast,
            Arrays.asList(loro, canarioPaciente, conejo, lobo, nutria, cocodrilo, serpiente, pezPayaso, pezCirujano)
        );

        System.out.println("\n--- caso de uso: REQ 02 ---");
        ControllerRio controller = new ControllerRio();
        List<Conejo> lstHeridos = controller.animalesRio();

        if (lstHeridos != null && !lstHeridos.isEmpty()) {
    
            System.out.println("\n--- caso de uso: REQ 01 (registro) ---");
            ejecutarRegistro(veterinario, lstHeridos);

            System.out.println("\n--- caso de uso: REQ 06 (Veterinario) ---");
            for (Conejo c : lstHeridos) {
                veterinario.curar(c);
            }
        } else {
            System.out.println("\nNo hubo heridos provenientes del accidente.");
        }

        System.out.println("\n--- caso de uso: REQ 08 ---");
        BienestarAnimal bienestar = new BienestarAnimal("Bienestar Animal");
        bienestar.cobrarConsultaEmergencia(lstHeridos, 30.0, true);
        System.out.println("FIN");
    }

    private void imprimirCreacion(
        Veterinario veterinario,
        Propietario cliente,
        Loro loro,
        Canario canarioPaciente,
        Canario canarioTravieso,
        Conejo conejo,
        Lobo lobo,
        Nutria nutria,
        Cocodrilo cocodrilo,
        Serpiente serpiente,
        PezPayaso pezPayaso,
        PezCirujanoAzul pezCirujano) {
        System.out.println(
            "El veterinario se ha creado de nombre \"" + veterinario.getNombre() + "\" con cedula \"" + veterinario.getCedula() + "\""
        );
        System.out.println(
            "El cliente se ha creado de nombre \"" + cliente.getNombre() + "\" con cedula \"" + cliente.getCedula() + "\""
        );
        System.out.println("Ha nacido el loro llamado \"" + loro.getNombre() + "\"");
        System.out.println("Ha nacido el canario llamado \"" + canarioPaciente.getNombre() + "\"");
        System.out.println("Ha nacido el canario llamado \"" + canarioTravieso.getNombre() + "\"");
        System.out.println("Ha nacido el conejo llamado \"" + conejo.getNombre() + "\"");
        System.out.println("Ha nacido el lobo llamado \"" + lobo.getNombre() + "\"");
        System.out.println("Ha nacido el nutria llamado \"" + nutria.getNombre() + "\"");
        System.out.println("Ha nacido el cocodrilo llamado \"" + cocodrilo.getNombre() + "\"");
        System.out.println("Ha nacido la serpiente llamada \"" + serpiente.getNombre() + "\"");
        System.out.println("Ha nacido el pez payaso \"" + pezPayaso.getNombre() + "\"");
        System.out.println("Ha nacido el pez cirujano azul \"" + pezCirujano.getNombre() + "\"");
    }

    private void ejecutarRegistro(Veterinario veterinario, List<? extends ReinoAnimal> animales) {
        System.out.println("\n--- R01: Registro ---\n");
        System.out.println("El veterinario esta:");
        for (ReinoAnimal animal : animales) {
            System.out.println(veterinario.registrarPaciente(animal));
        }
        System.out.println("\n--- Fin R01: Registro ---\n");
    }

    private void escenaCanarioYLoro(Canario canarioTravieso, Loro loro) {
        System.out.println("\n--- R03: Canario y Loro ---\n");
        canarioTravieso.picotear(loro);
        System.out.println("El loro \"" + loro.getNombre() + "\" grita desesperadamente que se detenga!!!!");
        canarioTravieso.comerSemillas("mijo ");
        canarioTravieso.posarseEnRama("almendro");
        canarioTravieso.emitirCanto();
        canarioTravieso.acicalarPlumas();
        loro.comerFrutasYSemillas("mango", "girasol");
        loro.imitarSonido("comida comida !!!!");
        loro.emitirCanto();
        loro.acicalarPlumas();
        System.out.println("\n--- Fin R03: Canario y Loro ---\n");
    }

    private void escenaReptil(Cocodrilo cocodrilo, Serpiente serpiente) {
        System.out.println("\n--- R04:Reptil ---\n");
        String comidaCocodrilo = "tilapia fresca";
        System.out.println(
            "El cocodrilo ("
                + cocodrilo.getNombre()
                + ") esta comiendo \""
                + comidaCocodrilo
                + "\" junto a la serpiente ("
                + serpiente.getNombre()
                + ")"
        );
        System.out.println(
            "En un momento al otro comienzan a pelear "
                + cocodrilo.getNombre()
                + " contra "
                + serpiente.getNombre()
        );
        serpiente.declararVictoria();
        System.out.println("\n--- Fin R04: reptil ---\n");
    }

    private void escenaPez(PezPayaso pezPayaso, PezCirujanoAzul pezCirujano) {
        System.out.println("\n--- R05:Pez ---\n");
        pezPayaso.comerCon(pezCirujano);
        pezPayaso.conversarCon(pezCirujano);
        pezPayaso.planearEscapeCon(pezCirujano, "buscar a su hijo Nemo");
        System.out.println("\n--- Fin R05: Pez ---\n");
    }

    private void ejecutarCuraciones(
        Veterinario veterinario,
        Loro loro,
        Canario canarioPaciente,
        Conejo conejo,
        Lobo lobo,
        Nutria nutria,
        Cocodrilo cocodrilo,
        Serpiente serpiente,
        PezPayaso pezPayaso,
        PezCirujanoAzul pezCirujano) {
        System.out.println("\n--- R06: Veterinario cura a los animales ---\n");
        List<ReinoAnimal> pacientes = new ArrayList<>();
        pacientes.add(loro);
        pacientes.add(canarioPaciente);
        pacientes.add(conejo);
        pacientes.add(lobo);
        pacientes.add(nutria);
        pacientes.add(cocodrilo);
        pacientes.add(serpiente);
        pacientes.add(pezPayaso);
        pacientes.add(pezCirujano);
        for (ReinoAnimal paciente : pacientes) {
            veterinario.curar(paciente);
        }
        System.out.println("\n--- Fin R06: Veterinario cura a los animales ---\n");
    }

    private void ejecutarPagos(Propietario cliente, DataFast dataFast, List<? extends ReinoAnimal> pacientes) {
        System.out.println("\n--- R07: Cliente paga  ---\n");
        String apellidoMayus = cliente.getApellido().toUpperCase();
        System.out.println(
            "Al cliente " + cliente.getNombre() + " " + apellidoMayus + " le ofrecen tres maneras de pagar por la antencion de sus animales"
        );
        System.out.println("1. Transferencia o Efectivo");
        System.out.println("2. Tarjeta de credito");
        System.out.println("3. Cheques Bancarios");
        System.out.println("El cliente " + cliente.getNombre() + " " + apellidoMayus + " elije la opcion 2");
        System.out.println();
        for (ReinoAnimal paciente : pacientes) {
            dataFast.procesarCobro(paciente, 25.0, 12.5);
        }
        dataFast.imprimirResumen();
        System.out.println("\n--- Fin R07: Cliente paga ---\n");
    }
}
