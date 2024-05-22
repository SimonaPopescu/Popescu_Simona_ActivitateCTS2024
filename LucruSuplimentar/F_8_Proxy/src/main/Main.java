package LucruSuplimentar.F_8_Proxy.src.main;

import classes.Autobuz;
import classes.Oprire;
import classes.OprireAutobuz;
import classes.Proxy;

public class Main {
    public static void main(String[] args) {
        Oprire oprire = new OprireAutobuz("Lizeanu");
        Autobuz autobuz = new Autobuz(true);
        oprire.oprireAutobuz(autobuz);

        Autobuz autobuz1 = new Autobuz(false);

        Proxy proxy = new Proxy(oprire);
        proxy.oprireAutobuz(autobuz1);
    }
}