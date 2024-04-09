package decorator;

import spital.DiagnosticAbstract;

public class Website extends Decorator{
    public Website(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("In cadrul website-ului ati primit diagnosticul " + super.diagnostic.getDenumire() + ", cu simpomele: "+
                this.diagnostic.getSimptome() + "si " + (super.diagnostic.isNecesitaSpitalizare() ? "" : "nu") + " necesita spotalizare");

    }
}
