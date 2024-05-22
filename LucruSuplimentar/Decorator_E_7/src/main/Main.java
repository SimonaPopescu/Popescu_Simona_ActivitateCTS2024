package main;

import classes.Bilet;
import classes.BiletAbstract;
import decorator.Decorator;
import decorator.MesajSustinere;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet("Popescu", 5, false);
        bilet.printeazaBilet();

        Decorator decorator = new MesajSustinere(bilet);
        decorator.printeazaBilet();
        decorator.printareMesaj();

        BiletAbstract  bilet1 = new Bilet("Simona", 6, true);
        bilet1.printeazaBilet();

        Decorator decorator1 = new MesajSustinere(bilet1);
        decorator1.printeazaBilet();
        decorator1.printareMesaj();
    }
}