package classes;

public class Caracteristici {
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Caracteristici(String model, int anFabricatie, int nrLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Caracteristici{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
