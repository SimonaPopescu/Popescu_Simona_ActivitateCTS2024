package main;


import classes.Adapter;
import classes.Banca;
import classes.Credit;
import creditLeasing.AcordareCreditLeasing;
import creditLeasing.CreditLeasing;

public class Main {
    public static void main(String[] args) {
        Credit credit = new Credit("Popescu", 500);
        credit.acordareCredit();

        Banca credit1 = new Credit("Daria", 1000);
        credit1.acordareCredit();

        CreditLeasing creditLeasing = new CreditLeasing("Ion", 7000);
        AcordareCreditLeasing acordareCreditLeasing = new AcordareCreditLeasing(creditLeasing);

        Adapter adapter = new Adapter(creditLeasing);
        adapter.acordareCredit();
    }
}