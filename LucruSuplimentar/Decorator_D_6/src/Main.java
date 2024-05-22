import classes.Card;
import classes.CardAbstract;
import decorator.Decorator;
import decorator.PlataContactless;

public class Main {
    public static void main(String[] args) {
        CardAbstract card = new Card("Popescu", "BCR");
        card.plataNormala();
        card.plataOnline();

        Decorator decorator = new PlataContactless(card);
        decorator.plataContactless();
    }
}