package main;

import aplicatieNoua.MedicamentAplicatie;
import farmacie.Adapter;
import farmacie.Farmacie;
import farmacie.Medicament;
import farmacie.VanzareMedicament;

public class Main {
    public static void main(String[] args) {

        Medicament med = new Medicament(1, 100);
        Medicament med1 = new Medicament(2, 150);

        Farmacie farmacie = new VanzareMedicament(med);
        farmacie.verificareDisponibilitate(300);

        MedicamentAplicatie medicamentAplicatie1= new MedicamentAplicatie(2, 150);
        Adapter adapter = new Adapter(medicamentAplicatie1);

        adapter.verificareDisponibilitate(300);
    }
}