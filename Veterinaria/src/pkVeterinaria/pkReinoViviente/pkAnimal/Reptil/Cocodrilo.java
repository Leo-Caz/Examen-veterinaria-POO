package pkVeterinaria.pkReinoViviente.pkAnimal.Reptil;

import pkVeterinaria.pkReinoViviente.pkAnimal.Pez.PezPayaso;
//no puede ser serpiente porque estamos hablando de vertebrados
public class Cocodrilo extends Reptil {
    public Cocodrilo(String nombre) {
        super(nombre);
    }

    public void comer() {
        System.out.println("La cocodrilo traga su alimento con calma....");
    }

    @Override
    protected void romperHuevo() {
        System.out.println("La cocodrilo esta rompiendo el huevo para deslizarse....");
    }

    public void sisearA(PezPayaso pez) {
        if (pez == null) {
            return;
        }
        System.out.println("La cocodrilo " + getNombre() + " esta siseando al pez payaso " + pez.getNombre() + " desde la orilla....");
    }
}
