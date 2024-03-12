package FactoryMethod.classes.factory;

import FactoryMethod.classes.Bracardier;
import FactoryMethod.classes.PersonalSpital;

public class FabricaBracardier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Bracardier(nume, salariu);
    }
}
