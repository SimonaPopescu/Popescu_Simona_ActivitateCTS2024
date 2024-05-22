package main;

import classes.Restaurant;
import observer.ClientFidel;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observer obs1 = new ClientFidel("Popescu");
        Observer obs2 = new ClientFidel("Gigel");

        List<Observer> observers = new ArrayList<>();
        observers.add(obs1);
        observers.add(obs2);

        Restaurant rest = new Restaurant(observers, "Restaurant");

        rest.notificareOferta();
        rest.notificareMeniu();
    }
}