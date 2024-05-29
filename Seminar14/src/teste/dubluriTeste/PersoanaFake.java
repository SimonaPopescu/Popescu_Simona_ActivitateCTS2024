package teste.dubluriTeste;

import classes.IPersoana;

public class PersoanaFake implements IPersoana {

    private String valoareGetSex;
    private int valoareGetVarsta;
    private boolean valoareGetCNP;

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareGetCNP(boolean valoareGetCNP) {
        this.valoareGetCNP = valoareGetCNP;
    }

    @Override
    public String getSex() {
        return valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoareGetCNP;
    }
}
