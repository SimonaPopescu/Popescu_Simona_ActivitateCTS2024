package classes;

public class Loc {
    private int nrLoc;
    private Stare stare;

    public Loc(int nrLoc) {
        this.nrLoc = nrLoc;
        this.stare = new Liber();
    }

    public int getNrLoc() {
        return nrLoc;
    }

    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void locOcupat(Loc loc){
        if(this.stare instanceof Liber){
            Stare stare = new Ocupat();
            stare.ocupare(this);

            System.out.println("Locul " + this.nrLoc + " a fost ocupat");
        } else {
            System.out.println("Locul " + this.nrLoc + " a fost deja ocupat/rezerva");
        }

        if(this.stare instanceof Rezervat){
            Stare stare = new Ocupat();
            stare.ocupare(this);

            System.out.println("Locul " + this.nrLoc + " a fost ocupat");
        } else {
            System.out.println("Locul " + this.nrLoc + " a fost deja ocupat/rezerva");
        }

    }

}
