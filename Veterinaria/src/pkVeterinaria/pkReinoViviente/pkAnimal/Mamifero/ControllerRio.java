package pkVeterinaria.pkReinoViviente.pkAnimal.Mamifero;

import java.util.ArrayList;
import java.util.List;

import pkVeterinaria.pkReinoViviente.pkAnimal.Ave.Ave;

public class ControllerRio {
    public Integer temperaturaGrado;

    public void animalesRio(){
        List<Conejos>       lstConejos   = new ArrayList<>();
        List<Lobos>         lstLobos     = new ArrayList<>();
        List<Nutrias>       lstNutrias   = new ArrayList<>();
        List<Ave>           lstAve       = new ArrayList<>();
        
        lstConejos.add(new Conejo("Buggs"));
        lstLobos.add(new Lobo("Lobezno"));
        lstNutrias.add(new Nutria("Nutty"));
        lstAve.add(new Ave("PajaroRio"));
       
    }

    public void iniciar(){
        //Objetos
    }
}

