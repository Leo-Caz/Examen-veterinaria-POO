package pkVeterinaria;

import pkVeterinaria.pkReinoViviente.pkAnimal.Reptil.*;

public class Main {
    public static void main(String[] args) {
        
        Serpiente serpiente = new Serpiente("Nani", "ratones");
        Cocodrilo cocodrilo = new Cocodrilo("Ange");

        cocodrilo.interactuar(serpiente);
        serpiente.interactuar(cocodrilo);
    }
}
