package classes;

public class Ocupat implements Stare{
    public Ocupat() {
    }

    @Override
    public void ocupare(Loc loc) {
        System.out.println("Locul este ocupat");
        loc.setStare(this);
    }
}
