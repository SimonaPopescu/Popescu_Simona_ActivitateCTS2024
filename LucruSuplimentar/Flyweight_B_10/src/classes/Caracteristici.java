package classes;

public class Caracteristici {
    private int nrMasa;
    private int nrPersoane;
    private float oraRezervare;

    public Caracteristici(int nrMasa, int nrPersoane, float oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public float getOraRezervare() {
        return oraRezervare;
    }

    public void setOraRezervare(float oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        return "Caracteristici{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", oraRezervare=" + oraRezervare +
                '}';
    }
}
