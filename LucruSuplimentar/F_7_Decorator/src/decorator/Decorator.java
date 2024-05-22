package decorator;

import classes.BiletAbstract;

public abstract class Decorator implements BiletAbstract{
    private BiletAbstract bilet;

    public Decorator(BiletAbstract bilet) {
        this.bilet = bilet;
    }
    public abstract void printeazaFelicitare();

    public void printeazaBilet(){
        bilet.printeazaBilet();
        System.out.println("Se printeaza si o felicitare!");
    }
    public int getNrCalatorii(){
        return bilet.getNrCalatorii();
    }
    public float getSuma(){
        return bilet.getSuma();
    }
}
