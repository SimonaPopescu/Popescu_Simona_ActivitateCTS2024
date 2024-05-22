package classes;

public class Pacient implements Flyweight{
    private String nume;
    private float nrTelefon;
    private String adresa;

    public Pacient(String nume, float nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(float nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", nrTelefon=" + nrTelefon +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public void descriereSalon(SalonCaracteristici salonCaracteristici) {
        System.out.println(this.toString() + " " + salonCaracteristici.toString());
    }
}
