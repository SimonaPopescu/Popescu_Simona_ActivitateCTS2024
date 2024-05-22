package classes;

import java.util.Enumeration;
import java.util.List;

public class Farmacie extends Subiect{
    private String numeFarmacie;

    public Farmacie(List<Observer> observers, String numeFarmacie) {
        super(observers);
        this.numeFarmacie = numeFarmacie;
    }

    @Override
    public void anuntareOferta() {
        String mesaj = "Exista o oferta!";
        trimiteNotificare(mesaj);
    }
}
