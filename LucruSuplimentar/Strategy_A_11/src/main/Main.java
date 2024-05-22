package main;

import classes.Card;
import classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient p = new Pacient("Popescu");

        p.plateste(300);

        p.setMetodaPlata(new Card());
        p.plateste(200);
    }
}