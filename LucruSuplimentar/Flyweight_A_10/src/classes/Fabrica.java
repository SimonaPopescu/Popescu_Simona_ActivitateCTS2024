package classes;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {

    private Map<String, Flyweight> pacienti;

    public Fabrica() {
        this.pacienti = new HashMap<String, Flyweight>();
    }

    public Flyweight getPacienti(String nume, float nrTelefon, String adresa){
        String cheie = nume + "_" + nrTelefon + "_" + adresa;
        Flyweight flyweight = pacienti.get(cheie);
        if(flyweight == null){
            flyweight = new Pacient(nume, nrTelefon, adresa);
            pacienti.put(cheie, flyweight);
            }
        return flyweight;
    }
}
