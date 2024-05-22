package main;

import classes.Caracteristici;
import classes.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        Caracteristici c1 = new Caracteristici(5, 3, 12);
        Caracteristici c2 = new Caracteristici(3, 10, 13);

        fabrica.getClient("Popescu", 0764412402, "@gmail.com").rezervare(c1);
    }
}