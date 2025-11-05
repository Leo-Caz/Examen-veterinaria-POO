package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ControllerRio {
    public Integer temperaturaGrado;

    public List<Conejo> animalesRio(){
        List<Conejo>       lstConejo   = new ArrayList<>();
        List<Lobo>         lstLobo     = new ArrayList<>();
        List<Nutria>       lstNutria   = new ArrayList<>();
        List<Conejo>       lstHeridos  = new ArrayList<>();

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

        int minSize = Math.min(lstConejo.size(), lstNutria.size());
            for (int i = 0; i < minSize; i++) {
                Conejo conejo = lstConejo.get(i);
                Nutria nutria = lstNutria.get(i);

                conejo.tomarAgua();
                nutria.nadar();
                conejo.jugar(nutria);
            }
        System.out.println("\nLos conejos y las nutrias están jugando alegremente en el río.\n");

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
        System.out.println("\nLos conejos y las nutrias se esconden rápidamente.\n");
        if (lstConejo.size() >= 2) {
            int i = ThreadLocalRandom.current().nextInt(lstConejo.size());
            int j;
        do { j = ThreadLocalRandom.current().nextInt(lstConejo.size()); 
        } while (j == i);

        Conejo v1 = lstConejo.get(i);
        Conejo v2 = lstConejo.get(j);

        if (!lstHeridos.contains(v1)) lstHeridos.add(v1);
        if (!lstHeridos.contains(v2)) lstHeridos.add(v2);

        if (!lstLobo.isEmpty()) {
            Lobo loboCazador = lstLobo.get(ThreadLocalRandom.current().nextInt(lstLobo.size()));
            loboCazador.cazar();
            loboCazador.comer(v1);
            System.out.println("\n" + loboCazador.getNombre() + " cazó a " + v1.getNombre() + " y otro lobo cazó a " + v2.getNombre() + ".\n");
        }
    }
    System.out.println("--- Fin R02: Animales del Río ---\n");
    return lstHeridos;
}
}

