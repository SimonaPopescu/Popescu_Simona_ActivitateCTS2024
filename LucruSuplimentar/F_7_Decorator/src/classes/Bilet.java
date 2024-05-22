package classes;

public class Bilet implements BiletAbstract{
    private float suma;
    private int nrCalatorii;

    public Bilet(float suma, int nrCalatorii) {
        this.suma = suma;
        this.nrCalatorii = nrCalatorii;
    }

    public float getSuma() {
        return suma;
    }

    public int getNrCalatorii() {
        return nrCalatorii;
    }


    @Override
    public void printeazaBilet() {
        System.out.println("Biletul are "
                + this.nrCalatorii + " calatorii si a fost "
                + this.suma + " lei");
    }
}
