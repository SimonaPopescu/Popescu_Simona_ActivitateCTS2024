package main;
import classes.Retragere;
import classes.RetragereBancomat;
import classes.RetragereSuma;

public class Main {
    public static void main(String[] args) {

        Retragere retragere = new Retragere(1, 500);
        RetragereBancomat retrageresuma = new RetragereSuma(1500, retragere);
        retrageresuma.retragereSuma();
    }
}