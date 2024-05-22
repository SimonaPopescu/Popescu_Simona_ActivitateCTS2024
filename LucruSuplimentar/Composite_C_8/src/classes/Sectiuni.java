package classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiuni extends StructuraAbstracta{
    private List<StructuraAbstracta> sectiuni;

    public Sectiuni(String denumire) {
        super(denumire);
        this.sectiuni = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        sectiuni.add(sa);
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        sectiuni.remove(sa);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if(index >=0 && index<= sectiuni.size()){
            return sectiuni.get(index);
        } else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare + "Sectiunea " +
                super.getDenumire() + " are urmatoarea structura: ");
        for(StructuraAbstracta sa: sectiuni){
            sa.afiseazaDescriere(identare + "   ");
        }
    }
}
