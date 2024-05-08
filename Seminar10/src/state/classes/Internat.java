package state.classes;

public class Internat implements Stare{
    protected Internat() {
    }

    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
    }
}
