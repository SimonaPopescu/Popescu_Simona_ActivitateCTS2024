package classes;

public class Pacient {
    private String name;
    private MetodaPlata metodaPlata;

    public Pacient(String name, MetodaPlata metodaPlata) {
        this.name = name;
        this.metodaPlata = metodaPlata;
    }

    public Pacient(String nume){
        this.name = nume;
        this.metodaPlata = new Cash();
    }

    public void plateste(double suma){
        metodaPlata.plateste(this.name, suma);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetodaPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }
}
