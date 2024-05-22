package classes;

public class Abonat implements Observer{
    private String numeAbonat;

    public Abonat(String numeAbonat) {
        this.numeAbonat = numeAbonat;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(numeAbonat + ", ai primit mesajul: " + mesaj);
    }
}
