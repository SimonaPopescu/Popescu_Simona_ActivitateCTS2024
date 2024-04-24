package strategy.main;// Portar +Verificare verificare; +setVerificare(); +verificaSuporter();
// Interface Verificare  -->  Verificator VIP, Verificator Tribuna, Verificator Peluza

import strategy.classes.Portar;
import strategy.classes.VerificatorPeluza;
import strategy.classes.VerificatorTribuna;
import strategy.classes.VerificatorVIP;

public class Main {
    public static void main(String[] args) {
        Portar portar = new Portar();
        String suporter1 = "GigelVip";
        String suporter2 = "GigelPeluza";
        String suporter3 = "GigelTribuna";

        portar.setStrategie(new VerificatorVIP());
        portar.verificaSuporteri(suporter1);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporteri(suporter2);
    }
}