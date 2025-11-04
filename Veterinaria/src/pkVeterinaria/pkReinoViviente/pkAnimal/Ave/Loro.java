package pkVeterinaria.pkReinoViviente.pkAnimal.Ave;

import pkVeterinaria.pkReinoViviente.pkAnimal.Reptil.Cocodrilo;

public class Loro extends Ave {
    public Loro(String nombre) {
        super(nombre);
    }

    @Override
    protected void romperCascaron() {
        System.out.println("El loro esta rompiendo el cascaron con su pico....");
    }

    public void comer() {
        System.out.println("El loro picotea semillas....");
    }

    public void hablar() {
        System.out.println("El loro repite palabras divertidas....");
    }

    public void hablarA(Cocodrilo serpiente) {
        if (serpiente == null) {
            return;
        }
        System.out.println("El loro " + getNombre() + " charla con la serpiente " + serpiente.getNombre() + " con mucha curiosidad....");
    }
}
