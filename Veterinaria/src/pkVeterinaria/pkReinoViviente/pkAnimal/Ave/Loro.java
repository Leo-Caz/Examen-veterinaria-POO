package pkVeterinaria.pkReinoViviente.pkAnimal.Ave;

public class Loro extends OmnivoroAve {
    public Loro(String nombre) {
        super(nombre, "verde esmeralda");
    }

    @Override
    public void emitirCanto() {
        String sonido = getUltimoSonidoImitado().isEmpty() ? "sus propios silbidos" : getUltimoSonidoImitado();
        System.out.println(
            "El loro "
                + getNombre()
                + " canta repitiendo "
                + sonido
                + " despues de "
                + getRacionesCompletas()
                + " racion(es) de comida."
        );
    }
}
