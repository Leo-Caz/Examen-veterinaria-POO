package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

public abstract class Anadromo extends Pez {
    protected String dieta;
    protected short edadReproduccion;

    public Anadromo(String nombre) {
        super(nombre);
    }

    public void migrar() {
        System.out.println(nombre + " está migrando hacia el río...");
    }
}
