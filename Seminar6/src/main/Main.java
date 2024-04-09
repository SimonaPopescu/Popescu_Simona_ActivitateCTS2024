package main;

import softNou.Bautura;
import softVechi.*;

public class Main {

    public static void platesteConsumatia(SoftBucatarie comanda){
        comanda.printareBon();
    }
    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        Produs produs1 = new Produs("Pizza", 40);
        Produs produs2 = new Produs("Paste", 45);
        bucatarie.adaugareProdus(produs1);
        bucatarie.adaugareProdus(produs2);

        //bucatarie.printareBon();

        platesteConsumatia(bucatarie);

        AdapterComandaBarBucatarie bar = new AdapterComandaBarBucatarie();

        bar.adaugaBautura(new Bautura("Apa", 12, 0));
        bar.adaugaBautura(new Bautura("Mojito", 25, 7));
        bar.adaugaBautura(new Bautura("Cola", 18, 0));

        Bautura bautura = new Bautura("Pepsi", 5, 0);
        AdapterBauturaProdus produs = new AdapterBauturaProdus(bautura);
        bar.adaugareProdus(produs);

        platesteConsumatia(bar);
    }
}