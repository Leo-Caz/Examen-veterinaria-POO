package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

public abstract class Pez {
    protected String nombre;

    public Pez(String nombre) {
        this.nombre = nombre;
    }

    public void esconderse() {
        System.out.println(nombre + " se está escondiendo...");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo...");
    }

    public void reproducirse() {
        System.out.println(nombre + " se está reproduciendo...");
    }

    public void jugar() {
        System.out.println(nombre + " está jugando...");
    }

    public void nadar() {
        System.out.println(nombre + " está nadando...");
    }

    public void respirar() {
        System.out.println(nombre + " está respirando...");
    }
}

