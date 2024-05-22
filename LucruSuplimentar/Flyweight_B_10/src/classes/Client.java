package classes;

public class Client implements Flyweight{
    private String nume;
    private float nrTelefon;
    private String email;

    public Client(String nume, float nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrTelefon=" + nrTelefon +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void rezervare(Caracteristici caracteristici) {
        System.out.println(this.toString() + " " + caracteristici.toString());
    }
}
