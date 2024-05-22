package classes;

public class arePinIntrodus implements Stare{
    protected arePinIntrodus() {
    }

    @Override
    public void retrage(Bancomat bancomat) {
        if(bancomat.getSuma() > 0){
            System.out.println("Bancomatul cu nr " + bancomat.getId() + " are disponibilă suma de " + bancomat.getSuma() + ". Retrageți banii dvs.");
        } else {
            bancomat.setStare(new nuAreBani());
            bancomat.getStare().retrage(bancomat);
        }
        bancomat.setStare(this);
    }
}
