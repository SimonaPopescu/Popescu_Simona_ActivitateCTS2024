package template.main;

import template.classes.Pacient;
import template.classes.SpitalPublic;

public class Main {
    public static void main(String[] args) {
        SpitalPublic spitalPublic = new SpitalPublic("Colentina", 2);
        Pacient pacient = new Pacient("Popescu", 5);
        Pacient pacient1 = new Pacient("Matei", 3);
        Pacient pacient2 = new Pacient("Ionut", 1);

        spitalPublic.internare(pacient);
        spitalPublic.internare(pacient1);
        spitalPublic.internare(pacient2);
    }
}
