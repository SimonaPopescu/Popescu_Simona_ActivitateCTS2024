package main;

import classes.Abonat;
import classes.Banca;
import classes.Observer;
import classes.Subiect;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observer abonat1 = new Abonat("Popescu");
        Observer abonat2 = new Abonat("Ion");

        List<Observer> observerList = new ArrayList<>();
        observerList.add(abonat1);
        observerList.add(abonat2);

        Banca banca = new Banca(observerList, "ING");
        banca.anuntaOferta();
    }
}