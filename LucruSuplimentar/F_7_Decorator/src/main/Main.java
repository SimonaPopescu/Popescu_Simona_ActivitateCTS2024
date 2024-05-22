package main;

import classes.Bilet;
import classes.BiletAbstract;
import decorator.Decorator;
import decorator.Felicitare;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet(10, 5);
        bilet.printeazaBilet();

        Decorator decorator = new Felicitare(bilet);
        decorator.printeazaBilet();
        decorator.printeazaFelicitare();
    }
}