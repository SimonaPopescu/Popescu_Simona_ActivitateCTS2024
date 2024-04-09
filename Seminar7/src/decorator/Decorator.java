package decorator;

import spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract{
    protected DiagnosticAbstract diagnostic;

    public abstract void afiseazaOnline();

    public Decorator(DiagnosticAbstract diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public String getDenumire() {
        return diagnostic.getDenumire();
    }

    @Override
    public String getSimptome() {
        return diagnostic.getSimptome();
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return diagnostic.isNecesitaSpitalizare();
    }

    @Override
    public void printeazaDiagnostic() {
        diagnostic.printeazaDiagnostic();
        System.out.println("Rezultatul este disponibil si pe platforma");
    }
}
