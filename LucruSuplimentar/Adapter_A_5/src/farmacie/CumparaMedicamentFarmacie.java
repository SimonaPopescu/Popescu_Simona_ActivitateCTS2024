package farmacie;

public class CumparaMedicamentFarmacie {
    MedicamentFarmacie medicamentFarmacie;

    public CumparaMedicamentFarmacie(MedicamentFarmacie medicamentFarmacie) {
        this.medicamentFarmacie = medicamentFarmacie;
    }

    public void cumparaMedicament(){
        System.out.println("S-a vandut medicamentul " + medicamentFarmacie.getNumeMedicamentFarmacie());
    }
}
