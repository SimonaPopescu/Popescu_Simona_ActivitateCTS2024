package LucruSuplimentar.F_8_Proxy.src.classes;

public class Autobuz {
    private boolean isPersoaneInAutobuz;

    public Autobuz(boolean isPersoaneInAutobuz) {
        this.isPersoaneInAutobuz = isPersoaneInAutobuz;
    }

    public boolean isPersoaneInAutobuz() {
        return isPersoaneInAutobuz;
    }

    public void setPersoaneInAutobuz(boolean persoaneInAutobuz) {
        isPersoaneInAutobuz = persoaneInAutobuz;
    }
}
