package main;

import classes.Autobuz;
import classes.Grup;
import classes.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta grupMic = new Grup("Grup mic");
        StructuraAbstracta grupMediu = new Grup("Grup mediu");

        StructuraAbstracta Autobuz = new Autobuz("A1", "Audi","Model", 10);
        StructuraAbstracta Autobuz1 = new Autobuz("A2", "Mercedes","Model", 10);

        StructuraAbstracta Autobuz3 = new Autobuz("A3", "VW","Model", 30);
        StructuraAbstracta Autobuz4 = new Autobuz("A4", "Dacia","Model", 30);

        grupMic.adaugareStructura(Autobuz);
        grupMic.adaugareStructura(Autobuz1);
        grupMic.afiseazaDescriere("     ");

        grupMediu.adaugareStructura(Autobuz3);
        grupMediu.adaugareStructura(Autobuz4);
        grupMediu.afiseazaDescriere("   ");

    }
}