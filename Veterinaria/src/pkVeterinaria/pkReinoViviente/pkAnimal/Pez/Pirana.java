package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

public class Pirana extends AguaDulce {
    public boolean tieneDientes;

    public Pirana(String nombre) {
        super(nombre);
        this.tieneDientes = true;
        this.dieta = "Carne";
        this.temperaturaAgua = 25.0f;
    }

    public void atacarPresa() {
        System.out.println(nombre + " está atacando a su presa...");
    }

    public void comer(String carne) {
        System.out.println(nombre + " está comiendo " + carne + "...");
    }
}
