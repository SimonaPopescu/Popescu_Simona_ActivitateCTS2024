package classes;

public class Cash implements MetodaPlata{
    @Override
    public void plateste(String nume, double sumaPlatita) {
        System.out.println("Pacientul " + nume + " plateste " + sumaPlatita + "CASH");
    }
}
