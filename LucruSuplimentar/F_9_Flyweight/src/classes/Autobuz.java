package classes;

public class Autobuz implements Flyweight{
    private String linie;
    private String primaStatie;
    private String ultimaStatie;

    public Autobuz(String linie, String primaStatie, String ultimaStatie) {
        this.linie = linie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public String getLinie() {
        return linie;
    }

    public void setLinie(String linie) {
        this.linie = linie;
    }

    public String getPrimaStatie() {
        return primaStatie;
    }

    public void setPrimaStatie(String primaStatie) {
        this.primaStatie = primaStatie;
    }

    public String getUltimaStatie() {
        return ultimaStatie;
    }

    public void setUltimaStatie(String ultimaStatie) {
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "linie=" + linie +
                ", primaStatie='" + primaStatie + '\'' +
                ", ultimaStatie='" + ultimaStatie + '\'' +
                '}';
    }

    @Override
    public void salvareInformatii(Caracteristici caracteristici) {
        System.out.println(this.toString() + caracteristici.toString());
    }
}
