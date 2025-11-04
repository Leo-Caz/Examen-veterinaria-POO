package pkVeterinaria.pkReinoViviente.pkAnimal;

import pkVeterinaria.pkReinoViviente.pkAnimal.Mamiferos.Acuatico;

public abstract class Pez extends Acuatico {
    protected Pez(String nombre) {
        super(nombre);
    }

    @Override
    protected void emergerDelHuevo() {
        System.out.println("El pez esta saliendo del huevo....");
    }

    public void respirarEnAgua() {
        System.out.println("El pez respira bajo el agua con sus branquias....");
    }
}
