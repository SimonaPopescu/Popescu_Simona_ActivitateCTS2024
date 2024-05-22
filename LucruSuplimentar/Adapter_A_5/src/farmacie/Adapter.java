package farmacie;

import softSpital.CumparareMedicamentSpital;

public class Adapter extends CumparaMedicamentFarmacie implements CumparareMedicamentSpital {

    public Adapter(MedicamentFarmacie medicamentFarmacie) {
        super(medicamentFarmacie);
    }
    @Override
    public void achizitioneazaMedicament() {
        super.cumparaMedicament();
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Nu e nevoie de reteta!");
    }
}
