package pkVeterinaria.pkReinoViviente.pkAnimal.Reptil;

public class Serpiente extends CarnivoroReptil {

    public Serpiente(String nombre, String comidaFavorita) {
        super(nombre, comidaFavorita);
    }

    protected String descripcionEspecie() {
        return "serpiente";
    }

    protected String descripcionConArticulo() {
        return "La serpiente";
    }

    public void declararVictoria() {
        System.out.println(descripcionConArticulo() + " (" + getNombre() + ") sale victoriosa");
    }
}
