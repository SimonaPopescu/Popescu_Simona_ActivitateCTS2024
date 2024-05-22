package farmacie;

public class MedicamentFarmacie {
    private String numeMedicamentFarmacie;

    public MedicamentFarmacie(String numeMedicamentFarmacie) {
        this.numeMedicamentFarmacie = numeMedicamentFarmacie;
    }

    public String getNumeMedicamentFarmacie() {
        return numeMedicamentFarmacie;
    }

    public void setNumeMedicamentFarmacie(String numeMedicamentFarmacie) {
        this.numeMedicamentFarmacie = numeMedicamentFarmacie;
    }

    @Override
    public String toString() {
        return "MedicamentFarmacie{" +
                "numeMedicamentFarmacie='" + numeMedicamentFarmacie + '\'' +
                '}';
    }
}
