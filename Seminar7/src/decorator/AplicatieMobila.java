package decorator;

import spital.DiagnosticAbstract;

public class AplicatieMobila extends Decorator{
    public AplicatieMobila(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("In cadrul aplicatiei mobile ati primit diagnosticul " + super.diagnostic.getDenumire() + ", cu simpomele: "+
                this.diagnostic.getSimptome() + "si " + (super.diagnostic.isNecesitaSpitalizare() ? "" : "nu")
                + " aveti nevoie de spotalizare");
    }
}
