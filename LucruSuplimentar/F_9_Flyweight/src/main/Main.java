package main;

import classes.Autobuz;
import classes.Caracteristici;
import classes.Fabrica;
import classes.Flyweight;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        Caracteristici caracteristici1 = new Caracteristici("Audi", 1999, 30);
        fabrica.getObiect("1","Aici", "Acolo").salvareInformatii(caracteristici1);

        Caracteristici caracteristici2 = new Caracteristici("Mercedes", 2009, 50);
        fabrica.getObiect("2", "S1", "S2").salvareInformatii(caracteristici2);
    }
}