package pkVeterinaria.pkHumano;

import pkVeterinaria.pkReinoViviente.pkAnimal.ReinoAnimal;

public class Veterinario extends Persona {
    private String login;
    private String password;

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
    }
}
