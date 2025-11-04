package pkVeterinaria.pkReinoViviente.pkAnimal;

import pkVeterinaria.pkReinoViviente.pkAnimal.Mamiferos.Mamifero;

public class Perro extends Mamifero {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        System.out.println("El perro esta comiendo sus croquetas....");
    }

    public void ladrar() {
        System.out.println("El perro ladra alegre....");
    }

    public void ladrarA(Loro loro) {
        if (loro == null) {
            return;
        }
        System.out.println("El perro " + getNombre() + " esta ladrando al loro " + loro.getNombre() + " con furia....");
    }
}
