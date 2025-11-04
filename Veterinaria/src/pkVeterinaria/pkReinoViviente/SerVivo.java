package pkVeterinaria.pkReinoViviente;

public abstract class SerVivo {
    private boolean estaVivo;
    private String nombre;
    private int edad;
    
    public SerVivo() {
        this.estaVivo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
