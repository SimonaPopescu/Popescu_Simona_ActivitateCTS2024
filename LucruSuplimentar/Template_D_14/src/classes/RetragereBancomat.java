package classes;

public abstract class RetragereBancomat {
    private float sumaBancomat;

    public float getSumaBancomat() {
        return sumaBancomat;
    }

    public void setSumaBancomat(float sumaBancomat) {
        this.sumaBancomat = sumaBancomat;
    }

    public RetragereBancomat(float sumaBancomat) {
        this.sumaBancomat = sumaBancomat;
    }

    public final void retragereSuma(){
        introducereCard();
        introducerePin();
        specificareSiVerificareSuma();
        retragereBaniBancomat();
        retragereCard();
    }

    public abstract void introducereCard();
    public abstract void introducerePin();
    public abstract void specificareSiVerificareSuma();
    public abstract void retragereBaniBancomat();
    public abstract void retragereCard();
}
