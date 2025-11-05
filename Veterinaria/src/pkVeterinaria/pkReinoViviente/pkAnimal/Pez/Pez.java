package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Acuatico;

public abstract class Pez extends Acuatico {
    protected Pez(String nombre) {
        super(nombre);
    }

    @Override
    public void emergerDelHuevo() {
        System.out.println("El pez esta saliendo del huevo....");
    }

    public void respirarEnAgua() {
        System.out.println("El pez respira bajo el agua con sus branquias....");
    }
}
