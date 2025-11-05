package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

public class Salmon extends Anadromo {
    private int distanciaMigrar;

    public Salmon(String nombre) {
        super(nombre);
        this.dieta = "Insectos y crustáceos";
        this.edadReproduccion = 3;
        this.distanciaMigrar = 1000;
    }

    public void saltarCascada() {
        System.out.println(nombre + " está saltando una cascada...");
    }

    public int getDistanciaMigrar() {
        return distanciaMigrar;
    }

}

