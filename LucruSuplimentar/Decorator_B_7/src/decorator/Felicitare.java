package decorator;

import classes.NotaDePlataAbstract;

public class Felicitare extends Decorator{
    public Felicitare(NotaDePlataAbstract notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printareFelicitare() {
        System.out.println("S-a printat o felicitare pentru nota cu totalul de" +
                this.notaPlata.getTotal() + " avand tips de " +
                this.notaPlata.getTips());
    }
}
