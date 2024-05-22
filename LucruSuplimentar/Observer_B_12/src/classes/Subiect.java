package classes;

import observer.Observer;

import java.util.List;

public abstract class Subiect {
    List<Observer> observers;

    public Subiect(List<Observer> observers) {
        this.observers = observers;
    }

    public void adaugareClientFidel(Observer obs){
        observers.add(obs);
    }

    public void stergereClientFidel(Observer obs){
        observers.remove(obs);
    }

    public void trimitereNotificare(String mesaj){
        for(Observer obs: observers){
            obs.receptionareMesaj(mesaj);
        }
    }

    public abstract void notificareOferta();
    public abstract void notificareMeniu();
}
