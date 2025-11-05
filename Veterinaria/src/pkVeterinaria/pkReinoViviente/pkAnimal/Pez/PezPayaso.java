package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Lobo;

public class PezPayaso extends Pez {
    public PezPayaso(String nombre) {
        super(nombre);
    }

    @Override
    public void emergerDelHuevo() {
        System.out.println("El pez payaso esta saliendo del huevo entre los corales....");
    }

    public void comer() {
        System.out.println("El pez payaso mordisquea el coral....");
    }

    public void nadarAlrededorDe(Lobo perro) {

        if (perro == null) {
            return;
        }
        System.out.println("El pez payaso " + getNombre() + " nada alrededor del perro " + perro.getNombre() + " con alegria....");
    }
}
