package classes;

public class PersoanaJuridica implements TipClient{
    @Override
    public void verificareActe(String numeClient) {
        System.out.println("Pentru clientul " + numeClient + " se solicita actele de infiintare si dovada.");

    }
}
