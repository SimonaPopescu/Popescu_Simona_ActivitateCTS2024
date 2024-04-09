package softVechi;

import softNou.Bar;
import softNou.Bautura;

public class AdapterComandaBarBucatarie extends Bar implements SoftBucatarie{
    @Override
    public void printareBon() {
        super.printareNota();
    }

    @Override
    public void adaugareProdus(Produs produs) {
        Bautura b = new Bautura(produs.getDenumire(), produs.getPret(), 0);
        super.adaugaBautura(b);
    }
}
