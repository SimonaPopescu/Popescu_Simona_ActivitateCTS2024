package main;

import classes.Medicament;
import classes.Sectiuni;
import classes.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta raceala = new Sectiuni("Raceala");
        StructuraAbstracta durere = new Sectiuni("Durere");

        StructuraAbstracta adultiRaceala = new Sectiuni("AdultiRaceala");
        StructuraAbstracta copiiRaceala = new Sectiuni("CopiiRaceala");

        StructuraAbstracta adultiDurere = new Sectiuni("AdultiDurere");
        StructuraAbstracta copiiDurere = new Sectiuni("CopiiDurere");

        StructuraAbstracta med1 = new Medicament("Nurofen", true);

        adultiRaceala.adaugaStructura(med1);

        raceala.adaugaStructura(adultiRaceala);
        raceala.adaugaStructura(copiiRaceala);

        raceala.afiseazaDescriere("     ");

    }
}