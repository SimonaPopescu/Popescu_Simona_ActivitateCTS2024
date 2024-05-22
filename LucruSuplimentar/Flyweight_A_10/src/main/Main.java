package main;

import classes.Fabrica;
import classes.SalonCaracteristici;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        SalonCaracteristici caracteristici1 = new SalonCaracteristici(10, 1, 3);
        SalonCaracteristici caracteristici2 = new SalonCaracteristici(11, 2, 4);
        SalonCaracteristici caracteristici3 = new SalonCaracteristici(10, 3, 7);

        fabrica.getPacienti("Popescu", 0764412402, "Bucuresti").descriereSalon(caracteristici1);
        fabrica.getPacienti("Matei", 076441242, "Dridu").descriereSalon(caracteristici2);
    }
}