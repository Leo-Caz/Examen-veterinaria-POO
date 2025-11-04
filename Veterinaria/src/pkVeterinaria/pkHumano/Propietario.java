package pkVeterinaria.pkHumano;

public class Propietario extends Persona {
    public Propietario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Propietario(String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }
}
