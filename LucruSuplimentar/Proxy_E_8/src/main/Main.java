package main;

import classes.Persoana;
import classes.Proxy;
import classes.Vanzare;
import classes.VanzareBilet;

public class Main {
    public static void main(String[] args) {
        Vanzare vanzareBilet = new VanzareBilet("El clasico", 100);

        Persoana pers1 = new Persoana("Popescu", 12);
        Persoana pers2 = new Persoana("Simo", 21);

        vanzareBilet.vanzare(pers1);
        vanzareBilet.vanzare(pers2);

        Vanzare proxyVanzareBilet = new Proxy(vanzareBilet);
        proxyVanzareBilet.vanzare(pers1);
        proxyVanzareBilet.vanzare(pers2);
    }
}