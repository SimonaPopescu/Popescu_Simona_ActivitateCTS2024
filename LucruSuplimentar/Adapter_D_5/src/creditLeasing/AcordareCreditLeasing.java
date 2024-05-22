package creditLeasing;

public class AcordareCreditLeasing {
    CreditLeasing creditLeasing;

    public AcordareCreditLeasing(CreditLeasing creditLeasing) {
        this.creditLeasing = creditLeasing;
    }

    public void acordareCreditLeasing(){
        System.out.println("Persoanei " + creditLeasing.getNume() +
                " i-a fost acordat credit de " +
                creditLeasing.getSuma() + " lei pentru Leasing");
    }
}
