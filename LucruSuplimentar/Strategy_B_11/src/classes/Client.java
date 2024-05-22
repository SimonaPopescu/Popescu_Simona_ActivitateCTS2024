package classes;

public class Client {
    private String nume;
    MetodaPlata metodaPlata;

    public Client(String nume, MetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata = new Cash();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public MetodaPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void efectueazaPlata(double suma){
        metodaPlata.plateste(this.nume, suma);
    }
}
