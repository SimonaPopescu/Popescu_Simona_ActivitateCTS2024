package state.main;

import state.classes.Pacient;
import state.classes.Stare;
import state.classes.SubObservatie;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gheorghita");

        pacient.agravareStare();
        pacient.vindecare();

        Pacient pacient1 = new Pacient("Ghita");
        pacient1.agravareStare();
        pacient1.vindecare();
    }
}