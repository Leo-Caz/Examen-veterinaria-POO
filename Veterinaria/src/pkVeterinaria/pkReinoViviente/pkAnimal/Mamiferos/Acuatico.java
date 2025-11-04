package pkVeterinaria.pkReinoViviente.pkAnimal.Mamiferos;

import pkVeterinaria.pkReinoViviente.pkAnimal.AnimalVertebrado;

public abstract class Acuatico extends AnimalVertebrado {
    protected Acuatico(String nombre) {
        super();
        setNombre(nombre);
        emergerDelHuevo();
    }

    protected void emergerDelHuevo() {
        System.out.println("El animal acuatico esta rompiendo el huevo....");
    }

    public void nadar() {
        System.out.println("El animal acuatico esta nadando....");
    }
}
