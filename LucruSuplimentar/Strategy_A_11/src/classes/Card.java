package classes;

public class Card implements MetodaPlata{
    @Override
    public void plateste(String nume, double sumaPlatita) {
        System.out.println("Pacientul " + nume + " plateste " + sumaPlatita + "CARD");

    }
}
