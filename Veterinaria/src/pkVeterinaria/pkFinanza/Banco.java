package pkVeterinaria.pkFinanza;

import pkVeterinaria.pkReinoViviente.pkAnimal.ReinoAnimal;

public class Banco {
    private final String nombre;
    private double totalConsultas;
    private double totalMedicamentos;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.totalConsultas = 0.0;
        this.totalMedicamentos = 0.0;
    }

    public void cobrarConsulta(ReinoAnimal paciente, double valor) {
        if (paciente == null || valor <= 0) {
            return;
        }
        totalConsultas += valor;
        System.out.println(nombre + " cobra " + valor + " por consulta de " + paciente.getNombre());
    }

    public void cobrarMedicamentos(ReinoAnimal paciente, double valor) {
        if (paciente == null || valor <= 0) {
            return;
        }
        totalMedicamentos += valor;
        System.out.println(nombre + " cobra " + valor + " por medicamentos de " + paciente.getNombre());
    }

    public double getTotalConsultas() {
        return totalConsultas;
    }

    public double getTotalMedicamentos() {
        return totalMedicamentos;
    }

    public double getTotalCobros() {
        return totalConsultas + totalMedicamentos;
    }

    protected String getNombre() {
        return nombre;
    }
}
