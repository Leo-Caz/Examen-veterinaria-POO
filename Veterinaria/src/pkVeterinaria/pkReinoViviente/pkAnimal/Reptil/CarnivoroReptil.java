package pkVeterinaria.pkReinoViviente.pkAnimal.Reptil;

public abstract class CarnivoroReptil extends Reptil {

    private static final String comida = "carne fresca";
    private final String comidaFavorita;

    protected CarnivoroReptil(String nombre, String comidaFavorita) {
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
}
