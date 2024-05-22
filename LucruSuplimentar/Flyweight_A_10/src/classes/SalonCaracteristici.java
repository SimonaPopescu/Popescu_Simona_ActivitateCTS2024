package classes;

public class SalonCaracteristici {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public SalonCaracteristici(int nrSalon, int nrPat, int nrZileSpitalizare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        return "SalonCaracteristici{" +
                "nrSalon=" + nrSalon +
                ", nrPat=" + nrPat +
                ", nrZileSpitalizare=" + nrZileSpitalizare +
                '}';
    }
}
