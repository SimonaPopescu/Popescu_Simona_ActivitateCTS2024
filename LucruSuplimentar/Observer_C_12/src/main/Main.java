package main;

import classes.Abonat;
import classes.Farmacie;
import classes.Observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observer abonat1 = new Abonat("Popescu");
        Observer abonsat2 = new Abonat("Daria");

        List<Observer> observerList = new ArrayList<>();
        observerList.add(abonat1);
        observerList.add(abonsat2);

        Farmacie farmacie = new Farmacie(observerList, "Catena");

        farmacie.anuntareOferta();

    }
}