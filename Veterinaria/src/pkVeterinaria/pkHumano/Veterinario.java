package pkVeterinaria.pkHumano;

import pkVeterinaria.pkReinoViviente.pkAnimal.ReinoAnimal;

public class Veterinario extends Persona {

    public Veterinario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Veterinario(String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }

    public String registrarPaciente(ReinoAnimal paciente) {

        if (paciente == null) {
            return "No hay paciente para registrar";
        }
        return "Registrando al " + paciente.getClass().getSimpleName();
    }

    public void curar(ReinoAnimal paciente) {

        if (paciente == null) {
            return;
        }
        String especie = paciente.getClass().getSimpleName().replaceAll("([A-Z])", " $1").trim().toLowerCase();
        System.out.println("El veterinario " + getNombre() + " esta curando a " + especie + " " + paciente.getNombre() + "....");
    }
}
