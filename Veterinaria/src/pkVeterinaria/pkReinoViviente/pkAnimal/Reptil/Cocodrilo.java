package pkVeterinaria.pkReinoViviente.pkAnimal.Reptil;

import pkVeterinaria.pkReinoViviente.pkAnimal.Pez.PezPayaso;

public class Cocodrilo extends Reptil {
    public Cocodrilo(String nombre) {
        super(nombre);
    }

    public void comer() {
        System.out.println("La cocodrilo traga su alimento con calma....");
    }

    public void sisearA(PezPayaso pez) {
  
        if (pez == null) {
            return;
        }
        System.out.println("La cocodrilo " + getNombre() + " esta siseando al pez payaso " + pez.getNombre() + " desde la orilla....");
    }
}
