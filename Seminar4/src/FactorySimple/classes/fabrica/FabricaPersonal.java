package FactorySimple.classes.fabrica;

import FactorySimple.classes.*;

public class FabricaPersonal {

    public PersonalSpital createObject(TipPersonal tipPersonal, String nume, int salariu) throws Exception{
        switch (tipPersonal){
            case MEDIC:
                Medic medic = new Medic(nume, salariu);
                return medic;
            case ASISTENT:
                Asistent asistent = new Asistent(nume, salariu);
                return asistent;
            case BRACARDIER:
                return new Brancardier(nume, salariu);
            case INFIRMIER:
                return new Infirmier(nume, salariu);
            default: throw new Exception("Tipul nu exista!");
        }
    }
}
