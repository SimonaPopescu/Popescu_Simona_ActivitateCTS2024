package classes;

public abstract class Proces {
    public final void proces(){
        asezareCoada();
        prezentareBilet();
        controlCorporal();
        intrareStadion();
        ocupareLoc();
    }

    protected abstract void asezareCoada();
    protected abstract void prezentareBilet();
    protected abstract void controlCorporal();
    protected abstract void intrareStadion();
    protected abstract void ocupareLoc();

}
