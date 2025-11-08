package pkVeterinaria.pkReinoViviente.pkAnimal.Reptil;

import pkVeterinaria.pkReinoViviente.pkAnimal.AnimalVertebrado;
import pkVeterinaria.pkReinoViviente.pkAnimal.Pez.PezPayaso;
import pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero.Mamifero; 

public abstract class Reptil extends AnimalVertebrado {
   
    protected String tipoReptil;   
    protected boolean esVenenoso;
    protected boolean tieneEscamas;

    protected Reptil(String nombre) {
        super();            
        setNombre(nombre);  
        this.tipoReptil = "Reptil";
        this.esVenenoso = false;
        this.tieneEscamas = true;
        romperHuevo();
    }

    public String getTipoReptil() { return tipoReptil; }
    public void setTipoReptil(String tipoReptil) { this.tipoReptil = tipoReptil; }

    public boolean isEsVenenoso() { return esVenenoso; }
    public void setEsVenenoso(boolean esVenenoso) { this.esVenenoso = esVenenoso; }

    public boolean isTieneEscamas() { return tieneEscamas; }
    public void setTieneEscamas(boolean tieneEscamas) { this.tieneEscamas = tieneEscamas; }

    protected void romperHuevo() {
        System.out.println("El reptil esta rompiendo el huevo....");
    }

    public void reptar() {
        System.out.println(getNombre() + " (reptil) se desplaza sigiloso....");
    }

    public void interactuarCon(AnimalVertebrado otro) {
        if (otro == null) return;

        if (otro instanceof PezPayaso) {
            PezPayaso p = (PezPayaso) otro;
            System.out.println(getNombre() + " observa al pez payaso " + p.getNombre() + " desde la orilla.");
        }
        else if (otro instanceof Mamifero) {
            Mamifero m = (Mamifero) otro;
            System.out.println(getNombre() + " mantiene distancia con el mamifero " + m.getNombre() + ".");
        }
        else {
            System.out.println(getNombre() + " interactua con " + otro.getNombre() + " de forma neutra.");
        }
    }
}
