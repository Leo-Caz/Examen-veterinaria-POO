package pkVeterinaria.pkReinoViviente.pkAnimal.Ave;

import pkVeterinaria.pkReinoViviente.pkAnimal.AnimalVertebrado;

public abstract class Ave extends AnimalVertebrado {
    public String colorPlumaje;

    public Ave(String nombre) {
        this(nombre, "plumaje multicolor");
    }

    public Ave(String nombre, String colorPlumaje) {
        super();
        setNombre(nombre);
        this.colorPlumaje = colorPlumaje;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void acicalarPlumas() {
        System.out.println("El ave " + getNombre() + " esta acicalando su plumaje " + colorPlumaje + "...");
    }

    public abstract void emitirCanto();
}
