package observer.classes;

import java.util.List;

public abstract class Subiect {
    List<Observer> observers;

    public Subiect(List<Observer> observers) {
        this.observers = observers;
    }

    public void adaugaAbondati(Observer obs) {
        observers.add(obs);
    }

    public void stergereAbonati(Observer obs) {
        observers.remove(obs);
    }

    public void notificareAbonati(String mesaj) {
        for(Observer o: observers){
            o.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaFotbal();
    public abstract void notificaVolei();
    public abstract void notificaHandbal();
}
