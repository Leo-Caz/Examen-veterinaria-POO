package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

import java.util.ArrayList;
import java.util.List;

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

        // Conejos y nutrias juegan juntos
        int minSize = Math.min(lstConejo.size(), lstNutria.size());
            for (int i = 0; i < minSize; i++) {
                Conejo conejo = lstConejo.get(i);
                Nutria nutria = lstNutria.get(i);

                conejo.tomarAgua();
                nutria.nadar();
                conejo.jugar(nutria);
            }
        System.out.println("\nLos conejos y las nutrias están jugando alegremente en el río.\n");
        // Los lobos comienzan a acechar
        for (Lobo lobo : lstLobo) {
            lobo.acechar();
        }
        System.out.println("\nLos lobos han comenzado a acechar...\n");
        // Conejos y nutrias se esconden
        for (Conejo conejo : lstConejo) {
            conejo.esconderse();
        }
        for (Nutria nutria : lstNutria) {
            nutria.esconderse();
        }
        System.out.println("\nLos conejos y las nutrias se esconden rápidamente.\n");
        // Los lobos cazan y hieren conejos
        if (lstConejo.size() >= 2) {
            lstLobo.forEach(Lobo::cazar);

            lstHeridos.add(lstConejo.get(0));
            lstHeridos.add(lstConejo.get(1));

            for (Lobo lobo : lstLobo) {
                lobo.comer(lstConejo.get(0));
            }
            System.out.println("\nLos lobos han cazado a dos conejos. 🐺🐇🐇\n");
        }
        System.out.println("--- Fin R02: Animales del Río ---\n");
    return lstHeridos;
}
}

