package classes;

public class Credit implements Banca{
    private String numePers;
    private float suma;

    public Credit(String numePers, float suma) {
        this.numePers = numePers;
        this.suma = suma;
    }

    @Override
    public void acordareCredit() {
        System.out.println("Persoanei " + numePers + " i-a fost acordat credit de " + suma + " lei");
    }

    @Override
    public String toString() {
        return "Credit{" +
                "numePers='" + numePers + '\'' +
                ", suma=" + suma +
                '}';
    }
}
