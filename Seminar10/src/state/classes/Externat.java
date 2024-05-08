package state.classes;

public class Externat implements Stare{

    protected Externat() {
    }

    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
    }
}
