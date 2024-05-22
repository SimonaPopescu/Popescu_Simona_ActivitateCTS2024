package classes;

import java.util.List;

public abstract class Subiect {
    List<Observer> observerList;

    public Subiect(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public void adaugareObserver(Observer obs){
        observerList.add(obs);
    }

    public void stergereObservabil(Observer obs){
        observerList.remove(obs);
    }

    public void trimitereNotificare(String mesaj){
        for(Observer obs: observerList){
            obs.primesteMesaj(mesaj);
        }
    }

    public abstract void anuntaOferta();
}
