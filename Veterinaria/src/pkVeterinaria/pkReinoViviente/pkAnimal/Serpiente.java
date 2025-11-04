package pkVeterinaria.pkReinoViviente.pkAnimal;

public class Serpiente extends Reptil {
    public Serpiente(String nombre) {
        super(nombre);
    }

    public void comer() {
        System.out.println("La serpiente traga su alimento con calma....");
    }

    @Override
    protected void romperHuevo() {
        System.out.println("La serpiente esta rompiendo el huevo para deslizarse....");
    }

    public void sisearA(PezPayaso pez) {
        if (pez == null) {
            return;
        }
        System.out.println("La serpiente " + getNombre() + " esta siseando al pez payaso " + pez.getNombre() + " desde la orilla....");
    }
}
