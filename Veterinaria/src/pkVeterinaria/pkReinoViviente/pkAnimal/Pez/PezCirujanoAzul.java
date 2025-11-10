package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

public class PezCirujanoAzul extends OmnivoroPez {
    public PezCirujanoAzul(String nombre) {
        super(nombre, "plancton y crustaceos");
    }

    @Override
    protected String descripcionEspecie() {
        return "pez cirujano azul";
    }
}
