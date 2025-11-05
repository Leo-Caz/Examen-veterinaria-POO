package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

public class Nutria extends Acuatico {
    public Boolean tieneGarras;

    public Nutria(String nombre) {
        super(nombre);
        this.tieneGarras = true;
    }   

    @Override
    public void nadar() {
        System.out.println("La nutria esta nadando juguetonamente en el rio....");
    }
}
