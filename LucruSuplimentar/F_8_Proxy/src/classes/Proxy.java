package LucruSuplimentar.F_8_Proxy.src.classes;

public class Proxy implements Oprire{
    private Oprire oprire;

    public Proxy(Oprire oprire) {
        this.oprire = oprire;
    }

    @Override
    public void oprireAutobuz(Autobuz autobuz) {
        if(autobuz.isPersoaneInAutobuz() == true){
            oprire.oprireAutobuz(autobuz);
            System.out.println("Autobuzul a oprit in statie!");
        } else{
            System.out.println("Autobuzul NU mai opreste in statii!");

        }
    }
}
