package classes;

import observer.Observer;

import java.util.List;

public abstract class Subiect {
    List<Observer> observers;

    public Subiect(List<Observer> observers) {
        this.observers = observers;
    }

    public void adaugaAbonati(Observer obs){
        observers.add(obs);
    }

    public void stergereAbonati(Observer obs){
        observers.remove(obs);
    }

    public void notificareAbonati(String mesaj){
        for(Observer obs: observers){
            obs.receptionareMesaj(mesaj);
        }
    }

    public abstract void notificareEpidemie();
    public abstract void notificareVirusNou();
}
