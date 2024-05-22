package classes;

public class Bancomat {

    private int id;
    private float suma;
    private Stare stare;

    public Bancomat(int id, float suma) {
        this.id = id;
        this.suma = suma;
        this.stare = new nuAreCard();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }
}
