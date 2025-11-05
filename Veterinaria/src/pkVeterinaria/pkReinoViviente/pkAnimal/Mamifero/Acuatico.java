package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

public abstract class Acuatico extends Mamifero {
    public String dieta;
    public Boolean respiraAire;

    public Acuatico(String nombre) {
        super(nombre);
        this.dieta = "Peces y algas";
        this.respiraAire = true;
    }

    public void emergerDelHuevo() {
        System.out.println("El mamifero esta saliendo del huevo....");
    }

    public void nadar() {
        System.out.println("El animal acuatico esta nadando....");
    }
}
