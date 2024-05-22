package classes;

public class Card implements MetodaPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Cloentul " + nume + " a platit suma de " + suma + " CARD");

    }
}
