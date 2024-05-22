package classes;

public class Persoana {
    public String nume;
    public int nrLoc;

    public Persoana(String nume, int nrLoc) {
        this.nume = nume;
        this.nrLoc = nrLoc;
    }

    public int getNrLoc() {
        return nrLoc;
    }

    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
