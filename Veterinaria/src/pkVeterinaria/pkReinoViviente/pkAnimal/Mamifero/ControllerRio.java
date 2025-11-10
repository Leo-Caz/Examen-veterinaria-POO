package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

import java.util.ArrayList;
import java.util.List;

public class ControllerRio {
    public Integer temperaturaGrado;

    public List<Conejo> animalesRio() {
        List<Conejo> lstConejo = new ArrayList<>();
        List<Lobo> lstLobo = new ArrayList<>();
        List<Nutria> lstNutria = new ArrayList<>();
        List<Conejo> lstHeridos = new ArrayList<>();

        lstConejo.add(new Conejo("Buggs"));
        lstConejo.add(new Conejo("Lola"));
        lstConejo.add(new Conejo("Carlos"));
        lstConejo.add(new Conejo("Roger"));

        lstLobo.add(new Lobo("Lobo Feroz"));
        lstLobo.add(new Lobo("Lobezno"));
        lstLobo.add(new Lobo("Marley"));

        lstNutria.add(new Nutria("Nutty"));
        lstNutria.add(new Nutria("Olivia"));
        lstNutria.add(new Nutria("Nina"));

        System.out.println("\n--- R02:Animales del Rio ---\n");

        System.out.println("Los mamiferos se preparan para alimentar a sus crias:");
        for (Conejo conejo : lstConejo) {
            conejo.lactar();
        }
        for (Lobo lobo : lstLobo) {
            lobo.lactar();
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            Conejo conejo = lstConejo.get(i);
            Nutria nutria = lstNutria.get(i);

            conejo.tomarAgua();
            nutria.nadar();
            conejo.jugar(nutria);
        }
        System.out.println("\nLos conejos y las nutrias est\u00E1n jugando alegremente en el r\u00EDo.\n");

        for (Lobo lobo : lstLobo) {
            lobo.acechar();
        }
        System.out.println("\nLos lobos han comenzado a acechar...\n");

        for (Conejo conejo : lstConejo) {
            conejo.esconderse();
        }
        for (Nutria nutria : lstNutria) {
            nutria.esconderse();
        }
        System.out.println("\nLos conejos y las nutrias se esconden r\u00E1pidamente.\n");

        Lobo loboFeroz = lstLobo.get(0);
        Conejo carlos = lstConejo.get(2);
        Conejo roger = lstConejo.get(3);

        loboFeroz.cazar();
        loboFeroz.comer(carlos);

        if (!lstHeridos.contains(carlos)) {
            lstHeridos.add(carlos);
        }
        if (!lstHeridos.contains(roger)) {
            lstHeridos.add(roger);
        }

        System.out.println("\nLobo Feroz caz\u00F3 a Carlos y otro lobo caz\u00F3 a Roger.\n");
        System.out.println("--- Fin R02: Animales del R\u00EDo ------ \n");

        return lstHeridos;
    }
}
