package pkVeterinaria.pkFinanza;

import pkVeterinaria.pkReinoViviente.pkAnimal.ReinoAnimal;

public class DataFast extends Banco {
    public DataFast() {
        super("DataFast");
    }

    public void procesarCobro(ReinoAnimal paciente, double costoConsulta, double costoMedicamentos) {
        cobrarConsulta(paciente, costoConsulta);
        cobrarMedicamentos(paciente, costoMedicamentos);
    }

    public void imprimirResumen() {
        System.out.println("Resumen de cobros de " + getNombre());
        System.out.println("Total consultas: " + getTotalConsultas());
        System.out.println("Total medicamentos: " + getTotalMedicamentos());
        System.out.println("Total general: " + getTotalCobros());
    }
}
