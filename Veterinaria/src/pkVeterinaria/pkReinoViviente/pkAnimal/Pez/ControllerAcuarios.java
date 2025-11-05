package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

import java.util.ArrayList;
import java.util.List;

public class ControllerAcuarios {

    public void iniciar() {
        List<Pirana> lstPiranha = new ArrayList<>();
        List<PezPayaso> lstPezPayaso = new ArrayList<>();
        List<Salmon> lstSalmon = new ArrayList<>();

        // Crear peces
        lstPiranha.add(new Pirana("Piraña Roja"));
        lstPiranha.add(new Pirana("Piraña Negra"));

        lstPezPayaso.add(new PezPayaso("Nemo"));
        lstPezPayaso.add(new PezPayaso("Marlin"));

        lstSalmon.add(new Salmon("Salmon del Pacífico"));

        System.out.println("Las pirañas están en su acuario de agua dulce.");
        System.out.println("El pez payaso está en su acuario de agua salada.");
        System.out.println("El salmón puede saltar entre acuarios.");
        System.out.println();

        // El salmón entra al acuario de las pirañas
        System.out.println("El salmón entra al acuario de agua dulce con las pirañas.");
        for (Pirana p : lstPiranha) {
            p.nadar();
        }

        // Las pirañas muerden al salmón
        System.out.println("Las pirañas muerden al salmón.");
        for (Pirana p : lstPiranha) {
            p.atacarPresa();
        }

        // El salmón escapa hacia el acuario del pez payaso
        System.out.println("El salmón salta hacia el acuario de agua salada.");
        for (Salmon s : lstSalmon) {
            s.saltarCascada();
            s.migrar();
        }

        // El salmón se encuentra con el pez payaso
        System.out.println("El salmón se encuentra con el pez payaso en el acuario de agua salada.");
        for (PezPayaso pp : lstPezPayaso) {
            pp.nadar();
        }

        System.out.println("Fin del ecosistema del acuario.");
    }
}
