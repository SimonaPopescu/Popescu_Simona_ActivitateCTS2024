package LucruSuplimentar.Proxy_A_9.src.main;

import classes.Internare;
import classes.InternarePacient;
import classes.Pacient;
import classes.Proxy;

public class Main {
    public static void main(String[] args) {
        Pacient pac1=new Pacient("Popescu", false);

        Internare internare = new InternarePacient(5);
        internare.internare(pac1);

        Internare proxy = new Proxy((InternarePacient) internare);
        proxy.internare(pac1);
    }
}