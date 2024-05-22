package main;

import clasees.Item;
import clasees.Sectiune;
import clasees.SectiuniMeniu;
import clasees.Subsectiune;

public class Main {
    public static void main(String[] args) {
        SectiuniMeniu startere = new Sectiune("Startere");
        SectiuniMeniu bauturi = new Sectiune("Bauturi");

        SectiuniMeniu sucuri = new Subsectiune("Sucuri");
        SectiuniMeniu cafele = new Subsectiune("Cafele");

        SectiuniMeniu aperitive = new Subsectiune("Aperitive");
        SectiuniMeniu desert = new Subsectiune("Desert");

        SectiuniMeniu bruschete = new Item("Bruschete", 15);
        SectiuniMeniu platou = new Item("Platou", 30);

        SectiuniMeniu tirmisu = new Item("Tiramisu", 25);
        SectiuniMeniu papanasi = new Item("Papanasi", 30);

        startere.adaugaOptiune(aperitive);
        startere.adaugaOptiune(desert);

        aperitive.adaugaOptiune(bruschete);
        aperitive.adaugaOptiune(platou);

        desert.adaugaOptiune(tirmisu);
        desert.adaugaOptiune(papanasi);

        SectiuniMeniu meniu = new Sectiune("Meniu");
        meniu.adaugaOptiune(startere);
        meniu.adaugaOptiune(bauturi);

        meniu.afiseazaDescriere("   ");
    }
}