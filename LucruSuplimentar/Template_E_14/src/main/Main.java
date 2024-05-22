package main;

import classes.Persoana;
import classes.Proces;
import classes.ProcesIntrareOcupare;

public class Main {
    public static void main(String[] args) {
        Persoana pers1 = new Persoana("Popescu", 12);
        Proces proc = new ProcesIntrareOcupare(pers1);
        proc.proces();
    }
}