package classes;

import java.util.List;

public abstract class Subiect {
    List<Observer> observers;

    public Subiect(List<Observer> observers) {
        this.observers = observers;
    }

    public void adaugareObservabil(Observer obs){
        observers.add(obs);
    }

    public void stergeObservabil(Observer obs){
        observers.remove(obs);
    }

    public void trimiteNotificare(String mesaj){
        for(Observer obs: observers){
            obs.primesteNotificare(mesaj);
        }
    }

    public abstract void anuntareOferta();
}
