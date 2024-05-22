package LucruSuplimentar.F_8_Proxy.src.classes;

public class OprireAutobuz implements Oprire{
    private String statie;

    public OprireAutobuz(String statie) {
        this.statie = statie;
    }

    @Override
    public void oprireAutobuz(Autobuz autobuz) {
        System.out.println("Autobuzul a oprit in statia " + this.statie);
    }
}
