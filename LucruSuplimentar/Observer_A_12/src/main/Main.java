package main;

import classes.Spital;
import observer.Abonat;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observer abonat1 = new Abonat("Popescu");
        Observer abonat2 = new Abonat("Gigel");
        Observer abonat3 = new Abonat("Matei");

        List<Observer> observers = new ArrayList<>();
        observers.add(abonat1);
        observers.add(abonat2);

        Spital spital = new Spital(observers, "Colentina");

        spital.notificareEpidemie();

        spital.adaugaAbonati(abonat3);

        spital.notificareEpidemie();

        spital.stergereAbonati(abonat1);
        spital.notificareVirusNou();
    }
}