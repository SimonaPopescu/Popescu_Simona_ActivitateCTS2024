package classes;

public class RetragereSuma extends RetragereBancomat{
    Retragere retragere;

    public RetragereSuma(float sumaBancomat, Retragere retragere) {
        super(sumaBancomat);
        this.retragere = retragere;
    }

    @Override
    public void introducereCard() {
        System.out.println("A fost introdus cardrul pentru retragerea cu id-ul:" + retragere.getId());
    }

    @Override
    public void introducerePin() {
        System.out.println("A fost introdus pinul pentru retragerea cu id-ul:" + retragere.getId());

    }

    @Override
    public void specificareSiVerificareSuma() {
        System.out.println("A fost introdusa suma de " + retragere.getSuma() + " lei pentru retragerea cu id-ul:" + retragere.getId());

    }

    @Override
    public void retragereBaniBancomat() {
        if(this.getSumaBancomat() > retragere.getSuma()){
            System.out.println("A fost retrasa suma de " + retragere.getSuma() + " de lei, pentru retragerea cu id-ul:" + retragere.getId());
            float sumaBancomat = this.getSumaBancomat() - retragere.getSuma();
            this.setSumaBancomat(sumaBancomat);
        }
    }

    @Override
    public void retragereCard() {
        System.out.println("A fost retras cardrul pentru retragerea cu id-ul:" + retragere.getId());

    }
}
