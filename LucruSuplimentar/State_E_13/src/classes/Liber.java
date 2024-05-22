package classes;

public class Liber implements Stare{
    public Liber() {
    }

    @Override
    public void ocupare(Loc loc) {
        System.out.println("Locul este liber");
        loc.setStare(this);
    }
}
