package FactoryMethod.classes;

public class Bracardier extends PersonalSpital {

    public Bracardier(String nume, int salariu){
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Bracardierul "+this.getNume() + " are salariul " + this.getSalariu());
    }
}

