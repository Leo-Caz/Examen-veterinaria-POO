package pkVeterinaria.pkFinanza;

import java.util.List;

import pkVeterinaria.pkReinoViviente.pkAnimal.ReinoAnimal;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Conejo;

public class DataFast extends Banco {
    public DataFast() {
        super("DataFast");
    }

    public void procesarCobro(ReinoAnimal paciente, double costoConsulta, double costoMedicamentos) {
        cobrarConsulta(paciente, costoConsulta);
        cobrarMedicamentos(paciente, costoMedicamentos);
    }

    public void procesarCobroEmergencia(ReinoAnimal paciente, double costoConsulta, double costoMedicamentos, boolean emergencia) {
        if(emergencia){
            cobrarConsulta(paciente, costoConsulta);
            cobrarMedicamentos(paciente, costoMedicamentos);
            System.out.println("Los gastos por emergencia han sido cargados a Bienestar Animal.");
        } else {
            procesarCobro(paciente, costoConsulta, costoMedicamentos);
        }
    }

    public void procesarCobroGrupal(List<? extends ReinoAnimal> pacientes,double costoConsulta, double costoMedicamentos,boolean emergencia) {
        if (pacientes == null || pacientes.isEmpty()) {
            System.out.println("No hay animales para cobrar.");
            return;
        }
        System.out.println(emergencia? "\n--- FACTURA DE EMERGENCIA (Bienestar Animal) ---": "\n--- FACTURA NORMAL (Cliente) ---");

        for (ReinoAnimal p : pacientes) {
            procesarCobroEmergencia(p, costoConsulta, costoMedicamentos, emergencia);
        }
        System.out.println("-----------------------------------------------");
    }

    public void imprimirResumen() {
        System.out.println("Resumen de cobros de " + getNombre());
        System.out.println("Total consultas: " + getTotalConsultas());
        System.out.println("Total medicamentos: " + getTotalMedicamentos());
        System.out.println("Total general: " + getTotalCobros());
    }
}
