package main;

import farmacie.Adapter;
import farmacie.MedicamentFarmacie;
import softSpital.CumparareMedicamentSpital;
import softSpital.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital("Nurofen", true);
        medicamentSpital.achizitioneazaMedicament();
        medicamentSpital.prezintaReteta();

        CumparareMedicamentSpital cumparareMedicamentSpital = new MedicamentSpital("NoSpa", false);
        cumparareMedicamentSpital.achizitioneazaMedicament();

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Parasinus");
        Adapter adapter = new Adapter(medicamentFarmacie);
        adapter.achizitioneazaMedicament();
    }
}