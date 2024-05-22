package decorator;

import classes.NotaDePlataAbstract;

public abstract class Decorator implements NotaDePlataAbstract {
    protected NotaDePlataAbstract notaPlata;

    public abstract void printareFelicitare();

    public Decorator(NotaDePlataAbstract notaPlata) {
        this.notaPlata = notaPlata;
    }

    @Override
    public void printareNota() {
        notaPlata.printareNota();
        System.out.println("Se printeaza si o felicitare");
    }

    @Override
    public float getTotal() {
        return notaPlata.getTotal();
    }

    @Override
    public float getTips() {
        return notaPlata.getTips();
    }
}
