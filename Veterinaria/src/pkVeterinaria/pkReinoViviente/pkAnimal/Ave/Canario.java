package pkVeterinaria.pkReinoViviente.pkAnimal.Ave;

public class Canario extends Ave {
    public Canario(String nombre) {
        super(nombre);
    }

    public void picotear(Loro loro) {
        if (loro == null) {
            return;
        }
        System.out.println(
            "El canario llamado \"" + getNombre() + "\" esta picoteando a el loro \"" + loro.getNombre() + "\""
        );
    }
}
