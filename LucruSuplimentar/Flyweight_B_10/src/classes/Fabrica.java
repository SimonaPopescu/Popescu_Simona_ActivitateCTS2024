package classes;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    Map<Float, Client> clienti;

    public Fabrica() {
        this.clienti = new HashMap<>();
    }

    public Flyweight getClient(String nume, float nrTel, String email){
        float cheie = nrTel;
        Flyweight flyweight = clienti.get(cheie);
        if(flyweight == null){
            flyweight = new Client(nume, nrTel, email);
            clienti.put(cheie, (Client) flyweight);
        }
        return  flyweight;
    }
}
