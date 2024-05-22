package classes;

public class nuAreCard implements Stare{
    protected nuAreCard() {
    }

    @Override
    public void retrage(Bancomat bancomat) {
        System.out.println("Introduceți un card mai întâi.");
    }
}
