package classes;

import java.util.ArrayList;
import java.util.List;

public class Grup extends StructuraAbstracta{
    List<StructuraAbstracta> grupuri;

    public Grup(String denumire) {
        super(denumire);
        this.grupuri = new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println("Grupul " + super.getDenumire() + " are urmatoarea structura: ");
        for(StructuraAbstracta gr: grupuri){
            gr.afiseazaDescriere(identare + "   ");
        }
    }

    @Override
    public void adaugareStructura(StructuraAbstracta sa) {
        grupuri.add(sa);
    }

    @Override
    public void stergereStructura(StructuraAbstracta sa) {
        grupuri.remove(sa);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if(index >= 0 && index <= grupuri.size()){
            return grupuri.get(index);
        }else{
            throw new IllegalArgumentException();
        }
    }
}
