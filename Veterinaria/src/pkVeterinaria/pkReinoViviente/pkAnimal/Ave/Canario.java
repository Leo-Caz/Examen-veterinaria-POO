package pkVeterinaria.pkReinoViviente.pkAnimal.Ave;

public class Canario extends HerbivoroAve {
    public Canario(String nombre) {
        super(nombre, "amarillo brillante");
    }

    public void picotear(Loro loro) {
        if (loro == null) {
            return;
        }
        System.out.println(
            "El canario llamado \"" + getNombre() + "\" esta picoteando a el loro \"" + loro.getNombre() + "\""
        );
    }

    @Override
    public void emitirCanto() {
        System.out.println(
            "El canario "
                + getNombre()
                + " trina melodias dulces despues de comer "
                + getSemillasConsumidas()
                + " raciones de semillas."
        );
    }
}
