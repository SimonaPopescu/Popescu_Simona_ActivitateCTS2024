package classes;

import creditLeasing.AcordareCreditLeasing;
import creditLeasing.CreditLeasing;

public class Adapter extends AcordareCreditLeasing implements Banca {
    public Adapter(CreditLeasing creditLeasing) {
        super(creditLeasing);
    }

    @Override
    public void acordareCredit() {
        super.acordareCreditLeasing();
    }
}
