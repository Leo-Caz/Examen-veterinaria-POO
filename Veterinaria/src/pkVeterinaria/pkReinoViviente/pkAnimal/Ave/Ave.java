package pkVeterinaria.pkReinoViviente.pkAnimal.Ave;

import pkVeterinaria.pkReinoViviente.pkAnimal.AnimalVertebrado;

public abstract class Ave extends AnimalVertebrado {
    protected Ave(String nombre) {
        super();
        setNombre(nombre);
        romperCascaron();
    }

    protected void romperCascaron() {
        System.out.println("El ave esta rompiendo el cascaron....");
    }
}
