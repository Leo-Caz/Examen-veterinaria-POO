package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

public abstract class Herbivoro extends Mamifero {
    public String dieta;
    
    public Herbivoro(String nombre) {
        super(nombre);
        this.dieta = "Vegetales";
    }

    public void pastar() {
        System.out.println("El herbivoro esta pastando en el campo....");
    }

    @Override
    public void comer() {
        System.out.println("El herbivoro esta comiendo vegetales....");
    }

}
