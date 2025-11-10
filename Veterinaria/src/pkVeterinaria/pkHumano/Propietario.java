package pkVeterinaria.pkHumano;

public class Propietario extends Persona {

    public Propietario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Propietario(String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }

    public String solicitarAtencion(boolean boca) {
        if (boca) {
            return "El propietario solicita atención urgente por problemas en la boca del animal.";
        } else {
            return "El propietario solicita atención general para su mascota.";
        }
    }
}
