package pkVeterinaria.pkReinoViviente.pkAnimal.Ave;

public class Loro extends Ave {
    public Loro(String nombre) {
        super(nombre);
    }

    @Override
    protected void romperCascaron() {
        System.out.println("El loro esta rompiendo el cascaron con su pico....");
    }
}
