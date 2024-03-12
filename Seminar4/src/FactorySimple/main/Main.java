package FactorySimple.main;
// Personal Spital ->Asistent
//                 ->Bracondier
//                 ->Medic
//                 <-Fabrica (create_Object()) <- TipPersonal

import FactorySimple.classes.fabrica.FabricaPersonal;
import FactorySimple.classes.PersonalSpital;
import FactorySimple.classes.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception {

        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        PersonalSpital medic = fabricaPersonal.createObject(TipPersonal.MEDIC, "Popescu Maria", 9000);
        PersonalSpital asistent = fabricaPersonal.createObject(TipPersonal.ASISTENT, "Popa Ana", 6000);
        PersonalSpital bracardier = fabricaPersonal.createObject(TipPersonal.BRACARDIER, "Ene Ioana", 7000);
        PersonalSpital infirmier = fabricaPersonal.createObject(TipPersonal.INFIRMIER, "State Elena", 9000);


        medic.afisareDetalii();
        asistent.afisareDetalii();
        bracardier.afisareDetalii();
        infirmier.afisareDetalii();
    }

}