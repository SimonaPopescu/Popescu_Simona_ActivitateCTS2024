package classes;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Spital extends Subiect{
    private String numeSpital;

    public Spital(List<Observer> observers, String numeSpital) {
        super(observers);
        this.numeSpital = numeSpital;
    }

    @Override
    public void notificareEpidemie() {
        String mesaj = "Exista o epidemie!";
        notificareAbonati(mesaj);
    }

    @Override
    public void notificareVirusNou() {
        String mesaj = "Exista un virus nou!";
        notificareAbonati(mesaj);
    }
}
