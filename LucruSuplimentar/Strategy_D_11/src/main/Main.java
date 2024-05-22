package main;

import classes.Client;
import classes.PersoanaFizica;
import classes.PersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Client c = new Client("Popescu");

        c.verificareActe();

        c.setTipClient(new PersoanaJuridica());
        c.verificareActe();

    }
}