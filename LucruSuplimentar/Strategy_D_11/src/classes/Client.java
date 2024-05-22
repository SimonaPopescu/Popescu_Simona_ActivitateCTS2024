package classes;

public class Client {
    private String nume;
    TipClient tipClient;

    public Client(String nume, TipClient tipClient) {
        this.nume = nume;
        this.tipClient = tipClient;
    }

    public Client(String nume) {
        this.nume = nume;
        this.tipClient = new PersoanaFizica();
    }

    public void verificareActe(){
        tipClient.verificareActe(nume);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public TipClient getTipClient() {
        return tipClient;
    }

    public void setTipClient(TipClient tipClient) {
        this.tipClient = tipClient;
    }
}
