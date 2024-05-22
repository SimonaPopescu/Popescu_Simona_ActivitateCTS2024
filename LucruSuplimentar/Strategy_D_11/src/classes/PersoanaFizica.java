package classes;

public class PersoanaFizica implements TipClient{
    @Override
    public void verificareActe(String numeClient) {
        System.out.println("Pentru clientul " + numeClient + " se solicita buletinul si adeverinat de munca.");
    }
}
