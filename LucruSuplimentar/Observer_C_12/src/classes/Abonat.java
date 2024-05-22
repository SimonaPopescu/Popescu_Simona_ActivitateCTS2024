package classes;

public class Abonat implements Observer{
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume + ", ai primit mesajul: " + mesaj);
    }
}
