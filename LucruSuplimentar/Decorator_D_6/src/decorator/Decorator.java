package decorator;

import classes.CardAbstract;

public abstract class Decorator implements CardAbstract {
    CardAbstract card;

    public abstract void plataContactless();

    public Decorator(CardAbstract card) {
        this.card = card;
    }

    @Override
    public void plataOnline() {
        card.plataOnline();
        System.out.println("Se poate face plata si contactless.");
    }

    @Override
    public void plataNormala() {
        card.plataNormala();
        System.out.println("Se poate face plata si contactless.");
    }

    @Override
    public String getBanca() {
        return card.getBanca();
    }

    @Override
    public String getNume() {
        return card.getNume();
    }
}
