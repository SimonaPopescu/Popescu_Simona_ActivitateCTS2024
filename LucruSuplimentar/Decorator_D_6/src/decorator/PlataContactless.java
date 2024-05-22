package decorator;

import classes.CardAbstract;

public class PlataContactless extends Decorator{
    public PlataContactless(CardAbstract card) {
        super(card);
    }

    @Override
    public void plataContactless() {
        System.out.println("Pentru cardul cu proprietarul " + this.card.getNume() +
                " emis la banca " + this.card.getBanca() + " se pot face plati CONTACTLESS");
    }
}
