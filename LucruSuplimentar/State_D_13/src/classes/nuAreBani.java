package classes;

public class nuAreBani implements Stare{
    @Override
    public void retrage(Bancomat bancomat) {
        System.out.println("Bancomatul nu mai are fonduri disponibile.");
    }
}
