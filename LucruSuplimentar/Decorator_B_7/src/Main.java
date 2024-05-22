import classes.NotaDePlata;
import classes.NotaDePlataAbstract;
import decorator.Decorator;
import decorator.Felicitare;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaPlata = new NotaDePlata(130, 13);
        notaPlata.printareNota();

        Decorator decorator = new Felicitare(notaPlata);
        decorator.printareFelicitare();
        decorator.printareNota();
    }
}