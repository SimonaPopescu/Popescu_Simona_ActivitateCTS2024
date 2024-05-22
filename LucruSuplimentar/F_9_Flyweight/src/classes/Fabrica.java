package classes;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Autobuz> autobuze;

    public Fabrica() {
        this.autobuze = new HashMap<>();
    }

    public Flyweight getObiect(String linie, String primaStatie, String ultimaStatie){
        String cheie = linie + "_" + primaStatie + "_" + ultimaStatie;
        Flyweight flyweight = autobuze.get(cheie);
        if(flyweight == null){
            flyweight = new Autobuz(linie, primaStatie, ultimaStatie);
            autobuze.put(cheie, (Autobuz) flyweight);
        }
        return flyweight;
    }
}
