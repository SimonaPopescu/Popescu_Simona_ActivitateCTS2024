package decorator;

import classes.BiletAbstract;

public class Felicitare extends Decorator{
    public Felicitare(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}
