package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

import pkVeterinaria.pkReinoViviente.pkAnimal.AnimalVertebrado;

public abstract class Mamifero extends AnimalVertebrado {
    public Mamifero(String nombre) {
        super();
        setNombre(nombre);
    }

    public void lactar() {
        System.out.println("El mamifero esta lactando....");
    }

    public void comer() {
        System.out.println("El mamifero esta comiendo.... Hambre!!");
    }

    public void jugar() {
        System.out.println("El mamifero esta jugando alegremente....");
    }

    public void tomarAgua() {
        System.out.println("El mamifero esta tomando agua....");
    }

    public void esconderse() {
        System.out.println("El mamifero se esta escondiendo....");
    }
}
