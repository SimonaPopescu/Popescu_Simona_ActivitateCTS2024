package clasees;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends SectiuniMeniu {
    List<SectiuniMeniu> sectiuni;

    public Sectiune(String denumire) {
        super(denumire);
        this.sectiuni = new ArrayList<>();
    }

    @Override
    public void adaugaOptiune(SectiuniMeniu om) {
        sectiuni.add(om);
    }

    @Override
    public void stergereOptiune(SectiuniMeniu om) {
        sectiuni.remove(om);
    }

    @Override
    public SectiuniMeniu getOptiune(int index) {
        if(index >=0 && index <= this.sectiuni.size()){
            return this.sectiuni.get(index);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare + "Sectiunea " + super.getDenumire() + " are urmatoarele componente: ");
        for(SectiuniMeniu sm : sectiuni){
            sm.afiseazaDescriere(identare + "    ");
        }
    }
}
