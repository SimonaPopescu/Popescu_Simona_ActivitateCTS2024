package classes;

public class Bilet implements BiletAbstract{
    private String nume;
    private int loc;
    private boolean isEchipaLocala;

    public Bilet(String nume, int loc, boolean isEchipaLocala) {
        this.nume = nume;
        this.loc = loc;
        this.isEchipaLocala = isEchipaLocala;
    }

    public String getNume() {
        return nume;
    }

    public int getLoc() {
        return loc;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setLoc(int loc) {
        this.loc = loc;
    }

    public boolean isEchipaLocala() {
        return isEchipaLocala;
    }

    public void setEchipaLocala(boolean echipaLocala) {
        isEchipaLocala = echipaLocala;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Persoana " + this.nume +
                        " are locul " + this.loc +
                        " si " + (this.isEchipaLocala ? false : " nu ") +
                        " are bilet la echipa locala.") ;
    }
}
