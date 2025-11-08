package pkVeterinaria.pkReinoViviente.pkAnimal.Reptil;

import pkVeterinaria.pkReinoViviente.pkAnimal.Pez.PezPayaso;
import pkVeterinaria.pkReinoViviente.pkAnimal.AnimalVertebrado;

public class Cocodrilo extends Reptil {

    public Cocodrilo(String nombre) {
        super(nombre);
        this.tipoReptil = "Cocodrilo";
        this.tieneEscamas = true;
        this.esVenenoso = false;
    }

    public void comer() {
        System.out.println("El cocodrilo devora lentamente a su presa...");
    }

    @Override
    protected void romperHuevo() {
        System.out.println("El cocodrilo rompe el huevo y se desliza hacia el agua...");
    }

    public void rugir() {
        System.out.println(getNombre() + " ruge con fuerza desde la orilla del río...");
    }

    public void morder(AnimalVertebrado otro) {
        if (otro == null) return;
        System.out.println(getNombre() + " muerde a " + otro.getNombre() + " con gran fuerza!");
    }

    public void sisearA(PezPayaso pez) {
        if (pez == null) return;
        System.out.println(getNombre() + " sisea al pez payaso " + pez.getNombre() + " desde la orilla...");
    }

    @Override
    public void interactuarCon(AnimalVertebrado otro) {
        if (otro instanceof PezPayaso) {
            sisearA((PezPayaso) otro);
        } else {
            super.interactuarCon(otro);
        }
    }
}
