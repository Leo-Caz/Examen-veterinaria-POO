package pkVeterinaria.pkReinoViviente.pkAnimal.Reptil;

public class Cocodrilo extends Reptil {

    public Cocodrilo(String nombre) {
        super(nombre);
    }

    @Override
    public void interactuar(Reptil otro) {
        System.out.println("El cocodrilo " + getNombre() +
                           " intenta morder a " + otro.getNombre());
        System.out.println("Pero se distraen comiendo carne fresca...");
    }
}
