package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

public abstract class OmnivoroPez extends Pez {
    private static final String comida = "algas y pequenos crustaceos";
    private final String comidaFavorita;

    public OmnivoroPez(String nombre, String comidaFavorita) {
        super(nombre);
        if (comidaFavorita == null || comidaFavorita.isBlank()) {
            this.comidaFavorita = comida;
        } else {
            this.comidaFavorita = comidaFavorita;
        }
    }

    protected String getComidaFavorita() {
        return comidaFavorita;
    }

    public void comerCon(Pez companero) {
        if (companero == null) {
            return;
        }
        System.out.println(
            "El "
                + descripcionEspecie()
                + " ("
                + getNombre()
                + ") esta comiendo \""
                + comidaFavorita
                + "\" junto a ("
                + companero.getNombre()
                + ")"
        );
    }
}
