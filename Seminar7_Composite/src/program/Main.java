package program;

import classes.Departament;
import classes.Sectie;
import classes.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta cardiologie = new Departament("Cardiologie", "Ana Popescu");
        StructuraAbstracta oftalmologie = new Departament("Oftalmologie", "Ion Popescu");
        StructuraAbstracta terapieIntensiva = new Sectie("Terapie Intensiva", 20, "Daria Popescu");
        StructuraAbstracta donare = new Sectie("Donare", 5, "Georgi Popescu");
        StructuraAbstracta optometrie = new Sectie("Optometrie", 7, " Flowie");

        cardiologie.adaugaStructura(oftalmologie);
        cardiologie.adaugaStructura(terapieIntensiva);
        oftalmologie.adaugaStructura(optometrie);
        terapieIntensiva.adaugaStructura(donare);

        StructuraAbstracta spital = new Departament("Spital", "Eu");
        spital.adaugaStructura(cardiologie);
        spital.adaugaStructura(oftalmologie);

        spital.afiseazaDescriere("  ");
    }
}