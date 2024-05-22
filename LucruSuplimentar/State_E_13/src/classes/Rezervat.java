package classes;

public class Rezervat implements Stare{
    public Rezervat() {
    }

    @Override
    public void ocupare(Loc loc) {
        System.out.println("Locul este rezervat");
        loc.setStare(this);
    }
}
