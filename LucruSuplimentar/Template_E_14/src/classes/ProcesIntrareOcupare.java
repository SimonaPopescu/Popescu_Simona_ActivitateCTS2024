package classes;

public class ProcesIntrareOcupare extends Proces {
    Persoana persoana;

    public ProcesIntrareOcupare(Persoana persoana) {
        this.persoana = persoana;
    }

    @Override
    protected void asezareCoada() {
        System.out.println(persoana.nume + " s-a asezat la coada");
    }

    @Override
    protected void prezentareBilet() {
        System.out.println(persoana.nume + " a prezentat biletul");

    }

    @Override
    protected void controlCorporal() {
        System.out.println(persoana.nume + " a facut controlul corporal.");

    }

    @Override
    protected void intrareStadion() {
        System.out.println(persoana.nume + " a intrat in stadion.");

    }

    @Override
    protected void ocupareLoc() {
        System.out.println(persoana.nume + " a ocupat locul " + persoana.getNrLoc());

    }
}
