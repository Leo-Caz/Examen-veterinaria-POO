package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

public class Conejo extends Herbivoro {
    public Boolean orejasLargas;

    public Conejo(String nombre) {
        super(nombre);
    }

    public void brincar() {
        System.out.println("El conejo esta brincando alegremente....");
    }
    
    @Override
    public void tomarAgua() {
        System.out.println("El conejo esta tomando agua fresca....");
    }
    @Override
    public void comer(){
        System.out.println("El conejo esta comiendo zanahorias....");
    }
}
