package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

public abstract class Carnivoro extends Mamifero {
    public String dieta;
    
    public Carnivoro(String nombre) {
        super(nombre);
        this.dieta = "Carne";
    }

    public void cazar() {
        System.out.println("El carnivoro esta cazando su presa....");
    }

    public void acechar() {
        System.out.println("El carnivoro esta acechando a su presa sigilosamente....");
    }
}
