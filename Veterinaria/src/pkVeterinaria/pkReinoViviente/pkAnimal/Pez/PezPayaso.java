package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

public class PezPayaso extends AguaSalada {
    private boolean tieneFranjasColores;
    private boolean viveAnemona;

    public PezPayaso(String nombre) {
        super(nombre);
        this.tieneFranjasColores = true;
        this.viveAnemona = true;
        this.omnivoro = "Plancton y algas";
        this.profundidadAgua = 10.0f;
    }

    public boolean getTieneFranjasColores() {
        return tieneFranjasColores;
    }

    public boolean getViveAnemona() {
        return viveAnemona;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " es un pez payaso con franjas de colores: " + tieneFranjasColores);
        System.out.println("Vive en anémona: " + viveAnemona);
    }
}

