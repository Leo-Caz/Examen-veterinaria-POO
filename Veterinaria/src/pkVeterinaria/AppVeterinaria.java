package pkVeterinaria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pkVeterinaria.pkFinanza.DataFast;
import pkVeterinaria.pkHumano.Propietario;
import pkVeterinaria.pkHumano.Veterinario;
import pkVeterinaria.pkReinoViviente.pkAnimal.Ave.Canario;
import pkVeterinaria.pkReinoViviente.pkAnimal.Ave.Loro;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Conejo;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.ControllerRio;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Lobo;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Nutria;
import pkVeterinaria.pkReinoViviente.pkAnimal.Pez.PezPayaso;
import pkVeterinaria.pkReinoViviente.pkAnimal.ReinoAnimal;
import pkVeterinaria.pkReinoViviente.pkAnimal.Reptil.Cocodrilo;

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
        PezPayaso pez = new PezPayaso("Nemo");
        ControllerRio controllerRio = new ControllerRio();
        DataFast dataFast = new DataFast();

        imprimirCreacion(veterinario, cliente, loro, canarioPaciente, canarioTravieso, conejo, lobo, nutria);
        ejecutarRegistro(veterinario, Arrays.asList(loro, canarioPaciente, conejo, lobo, nutria));

        List<Conejo> conejosHeridos = controllerRio.animalesRio();

        escenaCanarioYLoro(canarioTravieso, loro);
        escenaReptil(cocodrilo);
        escenaPez(pez, lobo);

        ejecutarCuraciones(veterinario, loro, canarioPaciente, conejo, lobo, nutria, conejosHeridos);
        ejecutarPagos(cliente, dataFast, Arrays.asList(loro, canarioPaciente, conejo, lobo, nutria));
    }

    private void imprimirCreacion(
        Veterinario veterinario,
        Propietario cliente,
        Loro loro,
        Canario canarioPaciente,
        Canario canarioTravieso,
        Conejo conejo,
        Lobo lobo,
        Nutria nutria
    ) {
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

    private void escenaReptil(Cocodrilo cocodrilo) {
        System.out.println("\n--- R04:Reptil ---\n");
        cocodrilo.reptar();
        cocodrilo.comer();
        System.out.println("\n--- Fin R04: reptil ---\n");
    }

    private void escenaPez(PezPayaso pez, Lobo lobo) {
        System.out.println("\n--- R05:Pez ---\n");
        pez.nadar();
        pez.comer();
        pez.nadarAlrededorDe(lobo);
        System.out.println("\n--- Fin R05: Pez ---\n");
    }

    private void ejecutarCuraciones(
        Veterinario veterinario,
        Loro loro,
        Canario canarioPaciente,
        Conejo conejo,
        Lobo lobo,
        Nutria nutria,
        List<Conejo> conejosHeridos
    ) {
        System.out.println("\n--- R06: Veterinario cura a los animales ---\n");
        List<ReinoAnimal> pacientes = new ArrayList<>();
        pacientes.add(loro);
        pacientes.add(canarioPaciente);
        pacientes.add(conejo);
        pacientes.add(lobo);
        pacientes.add(nutria);
        if (conejosHeridos != null) {
            pacientes.addAll(conejosHeridos);
        }
        for (ReinoAnimal paciente : pacientes) {
            veterinario.curar(paciente);
        }
        System.out.println("\n--- Fin R06: Veterinario cura a los animales ---\n");
    }

    private void ejecutarPagos(Propietario cliente, DataFast dataFast, List<? extends ReinoAnimal> pacientes) {
        System.out.println("\n--- R07: Cliente paga  ---\n");
        System.out.println(
            "El cliente " + cliente.getNombre() + " " + cliente.getApellido() + " esta pagando la atencion de sus animales...."
        );
        for (ReinoAnimal paciente : pacientes) {
            dataFast.procesarCobro(paciente, 25.0, 12.5);
        }
        dataFast.imprimirResumen();
        System.out.println("\n--- Fin R07: Cleinte paga ---\n");
    }
}
