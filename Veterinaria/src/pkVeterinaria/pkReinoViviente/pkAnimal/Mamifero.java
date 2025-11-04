package pkVeterinaria.pkReinoViviente.pkAnimal;

public abstract class Mamifero extends AnimalVertebrado {
    protected Mamifero(String nombre) {
        super();
        setNombre(nombre);
        lactar();
    }

    public void lactar() {
        System.out.println("El mamifero esta lactando....");
    }

    public void comer() {
        System.out.println("El mamifero esta comiendo.... Hambre!!");
    }
}
