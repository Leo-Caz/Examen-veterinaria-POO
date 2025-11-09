package pkVeterinaria.pkHumano;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pkVeterinaria.pkReinoViviente.pkAnimal.ReinoAnimal;

public class Veterinario extends Persona {
    private String login;
    private String password;

    private List<ReinoAnimal> historialAtenciones = new ArrayList<>();
    private List<String> tratamientosAplicados = new ArrayList<>();

    public Veterinario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Veterinario(String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean setClave(String login, String password) {

        if (login == null || password == null) {
            return false;
        }
        if (login.isEmpty() || password.isEmpty()) {
            return false;
        }
        setLogin(login);
        setPassword(password);
        return true;
    }

    public void curar(ReinoAnimal paciente) {

        if (paciente == null) {
            return;
        }
        String especie = paciente.getClass().getSimpleName().replaceAll("([A-Z])", " $1").trim().toLowerCase();
        System.out.println("El veterinario " + getNombre() + " esta curando a " + especie + " " + paciente.getNombre() + "....");
        agregarAlHistorial(paciente);
    }

    public void agregarAlHistorial(ReinoAnimal animal) {

        if (animal != null) historialAtenciones.add(animal);
    }

    public List<ReinoAnimal> getHistorialAtenciones() {
        return Collections.unmodifiableList(historialAtenciones);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de atenciones de " + getNombre() + ":");
        for (ReinoAnimal paciente : historialAtenciones) {
            System.out.println("- " + paciente.getNombre() + " (" + paciente.getClass().getSimpleName() + ")");
        }
    }

    public void registrarTratamiento(String tratamiento) {

        if (tratamiento != null && !tratamiento.isEmpty()) tratamientosAplicados.add(tratamiento);
    }

    public void mostrarTratamientos() {
        System.out.println("Tratamientos aplicados por " + getNombre() + ":");
        for (String t : tratamientosAplicados) {
            System.out.println("- " + t);
        }
    }

    public void recomendarCuidados() {
        System.out.println("Recomendación general: Mantén vacunado a tu animal y aliméntalo balanceadamente.");
    }
}
