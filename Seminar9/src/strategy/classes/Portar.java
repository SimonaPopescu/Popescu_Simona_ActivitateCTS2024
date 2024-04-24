package strategy.classes;

public class Portar {
    private Verificator strategie;

    public Portar(Verificator strategie) {
        this.strategie = strategie;
    }

    public Portar() {
        this.strategie = new VerificatorPeluza();
    }

    public void setStrategie(Verificator strategie) {
        this.strategie = strategie;
    }

    public void verificaSuporteri(String numeSuporter) {
        strategie.verifica(numeSuporter);
    }
}
