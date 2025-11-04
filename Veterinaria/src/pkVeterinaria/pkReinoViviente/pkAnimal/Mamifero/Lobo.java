package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

import pkVeterinaria.pkReinoViviente.pkAnimal.Ave.Loro;

public class Lobo extends Carnivoro {
    public Boolean tieneDientes;
    public Lobo(String nombre) {
        super(nombre);
    }
    @Override
    public void comer() {
        System.out.println("El lobo esta comiendo su preza....");
    }

    public void aullar() {
        System.out.println("El lobo aulla alegre....");
    }

    public void comer(Conejo conejo) {
        if (conejo == null) {
            return;
        }
        System.out.println("El lobo " + this.getNombre() + " logro cazar al conejo " + conejo.getNombre() + " ....");
    }

    public void comerLoro(Loro loro) {
        if (loro == null) {
            return;
        }
        System.out.println("El perro " + this.getNombre() + " esta ladrando al loro " + loro.getNombre() + " con furia....");
    }
}
