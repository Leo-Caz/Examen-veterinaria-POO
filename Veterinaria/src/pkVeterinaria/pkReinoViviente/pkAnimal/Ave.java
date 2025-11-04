package pkVeterinaria.pkReinoViviente.pkAnimal;

public abstract class Ave extends AnimalVertebrado {
    protected Ave(String nombre) {
        super();
        setNombre(nombre);
        romperCascaron();
    }

    protected void romperCascaron() {
        System.out.println("El ave esta rompiendo el cascaron....");
    }

    public void volar() {
        System.out.println("El ave esta volando....");
    }
}
