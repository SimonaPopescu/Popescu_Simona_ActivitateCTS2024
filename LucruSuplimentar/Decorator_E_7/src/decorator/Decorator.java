package decorator;

import classes.BiletAbstract;

public abstract class Decorator implements BiletAbstract{
    protected BiletAbstract bilet;

    public Decorator(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public void printeazaBilet(){
        bilet.printeazaBilet();
        System.out.println("Se afiseaza un mesaj!");
    }
    public String getNume(){
        return bilet.getNume();
    }
    public int getLoc(){
        return bilet.getLoc();
    }
    public boolean isEchipaLocala(){
        return bilet.isEchipaLocala();
    }

    public abstract void printareMesaj();
}
