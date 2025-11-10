package pkVeterinaria.pkReinoViviente.pkAnimal.Ave;

public abstract class HerbivoroAve extends Ave {
    private int semillasConsumidas;
    private String ultimaRamaVisitada;
    
    public HerbivoroAve(String nombre, String colorPlumaje) {
        super(nombre, colorPlumaje);
        this.ultimaRamaVisitada = "arbusto cercano";
    }
    public void comerSemillas(String tipoSemilla) {
        semillasConsumidas++;
        System.out.println(
            "El ave herbivora "
                + getNombre()
                + " esta comiendo semillas de "
                + tipoSemilla
                + " por "
                + semillasConsumidas
                + " vez(es)...."
        );
    }
    public void posarseEnRama(String arbol) {
        ultimaRamaVisitada = arbol;
        System.out.println(
            "El ave herbivora "+ getNombre()+ " se posa en la rama del "+ ultimaRamaVisitada+ " para observar el entorno....");
    }
    public int getSemillasConsumidas() {
        return semillasConsumidas;
    }
}
