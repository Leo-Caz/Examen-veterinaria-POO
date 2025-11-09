package pkVeterinaria.pkFinanza;

import pkVeterinaria.pkReinoViviente.pkAnimal.ReinoAnimal;

import java.util.List;

public class BienestarAnimal extends Banco{
    public BienestarAnimal(String nombre) {
        super(nombre);
    }

    public void cobrarConsultaEmergencia(List<? extends ReinoAnimal> pacientes, double valor, boolean emergencia) {
         if (pacientes == null || pacientes.isEmpty()) {
            System.out.println("No hay animales para cobrar.");
            return;
        }

        System.out.println(emergencia? "\n--- FACTURA DE EMERGENCIA (Bienestar Animal) ---": "\n--- FACTURA NORMAL (Cliente) ---");

        for (ReinoAnimal p : pacientes) {
            cobrarConsulta(p, valor);
            cobrarMedicamentos(p, valor);
            System.out.println("Bienestar animal paga por consulta y medicamentos en caso de emergencia.");
        }
        System.out.println("-----------------------------------------------");
    } 
}
