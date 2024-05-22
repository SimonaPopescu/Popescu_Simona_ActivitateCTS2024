package observer;

public class Abonat implements Observer{
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(nume + ", ai primit mesajul: " + mesaj);
    }
}
