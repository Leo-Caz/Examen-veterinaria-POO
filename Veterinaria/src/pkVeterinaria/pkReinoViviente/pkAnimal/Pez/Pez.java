package pkVeterinaria.pkReinoViviente.pkAnimal.Pez;

import pkVeterinaria.pkReinoViviente.pkAnimal.AnimalVertebrado;

public abstract class Pez extends AnimalVertebrado {
    public Pez(String nombre) {
        super();
        setNombre(nombre);
    }

    public void conversarCon(Pez companero) {
        if (companero == null) {
            return;
        }
        System.out.println(
            "El "
                + descripcionEspecie()
                + " ("
                + getNombre()
                + ") conversa con el "
                + companero.descripcionEspecie()
                + " ("
                + companero.getNombre()
                + ")"
        );
    }

    public void planearEscapeCon(Pez companero, String objetivo) {
        if (companero == null) {
            return;
        }
        System.out.println(
            "El "
                + descripcionEspecie()
                + " ("
                + getNombre()
                + ") planea escaparse con "
                + companero.getNombre()
                + " para "
                + objetivo
        );
    }

    protected abstract String descripcionEspecie();
}
