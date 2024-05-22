package creditLeasing;

public class CreditLeasing {
    private String nume;
    private float suma;

    public CreditLeasing(String nume, float suma) {
        this.nume = nume;
        this.suma = suma;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "CreditLeasing{" +
                "nume='" + nume + '\'' +
                ", suma=" + suma +
                '}';
    }
}
