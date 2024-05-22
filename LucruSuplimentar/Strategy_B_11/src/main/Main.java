package main;

import classes.Card;
import classes.Cash;
import classes.Client;
import classes.MetodaPlata;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Popescu");

        c1.efectueazaPlata(200);

        MetodaPlata card = new Card();
        c1.setMetodaPlata(card);
        c1.efectueazaPlata(300);
    }
}