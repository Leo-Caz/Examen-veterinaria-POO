package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

public class PezPayaso extends OmnivoroPez {
    public PezPayaso(String nombre) {
        super(nombre, "anemonas y algas");
    }

    @Override
    protected String descripcionEspecie() {
        return "pez payaso";
    }
}
