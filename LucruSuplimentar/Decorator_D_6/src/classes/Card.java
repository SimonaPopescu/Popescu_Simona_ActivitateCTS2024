package classes;

public class Card implements CardAbstract{
    private String nume;
    private String banca;

    public Card(String nume, String banca) {
        this.nume = nume;
        this.banca = banca;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getBanca() {
        return banca;
    }

    public void setBanca(String banca) {
        this.banca = banca;
    }

    @Override
    public void plataOnline() {
        System.out.println("Cardul cu proprietareul " + this.nume +
                " de la banca " + this.banca + " face plata ONLINE");
    }

    @Override
    public void plataNormala() {
        System.out.println("Cardul cu proprietareul " + this.nume +
                " de la banca " + this.banca + " face plata NORMAL");
    }
}
