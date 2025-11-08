package pkVeterinaria.pkReinoViviente.pkAnimal.Ave;

public abstract class OmnivoroAve extends Ave {
    private int racionesCompletas;
    private String ultimoSonidoImitado;

    protected OmnivoroAve(String nombre, String colorPlumaje) {
        super(nombre, colorPlumaje);
        this.ultimoSonidoImitado = "";
    }

    public void comerFrutasYSemillas(String fruta, String semilla) {
        racionesCompletas++;
        System.out.println(
            "El ave omnivora "+ getNombre()+ " devora un trozo de "+ fruta+ " con semillas de "+ semilla+ " (racion "+ racionesCompletas+ ")....");
    }

    public void imitarSonido(String sonido) {
        ultimoSonidoImitado = sonido;
        System.out.println(
            "El ave omnivora "
                + getNombre()
                + " esta imitando el sonido: \""
                + ultimoSonidoImitado
                + "\"...."
        );
    }

    protected String getUltimoSonidoImitado() {
        return ultimoSonidoImitado;
    }

    protected int getRacionesCompletas() {
        return racionesCompletas;
    }
}
