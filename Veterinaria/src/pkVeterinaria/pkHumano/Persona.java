package pkVeterinaria.pkHumano;

public abstract class Persona {
    private String cedula;
    private String nombre;
    private String apellido;

    protected Persona(String nombre, String apellido) {
        setNombre(nombre);
        setApellido(apellido);
    }

    protected Persona(String cedula, String nombre, String apellido) {
        setCedula(cedula);
        setNombre(nombre);
        setApellido(apellido);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null) {
            this.apellido = null;
            return;
        }
        this.apellido = apellido.toUpperCase();
    }

}
