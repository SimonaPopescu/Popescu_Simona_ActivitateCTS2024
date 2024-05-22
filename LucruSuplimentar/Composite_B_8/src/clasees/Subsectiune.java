package clasees;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune extends SectiuniMeniu{
    List<SectiuniMeniu> subsectiuni;

    public Subsectiune(String denumire) {
        super(denumire);
        this.subsectiuni = new ArrayList<>();
    }

    @Override
    public void adaugaOptiune(SectiuniMeniu om) {
        subsectiuni.add(om);
    }

    @Override
    public void stergereOptiune(SectiuniMeniu om) {
        subsectiuni.remove(om);
    }

    @Override
    public SectiuniMeniu getOptiune(int index) {
        if(index >=0 && index <= this.subsectiuni.size()){
            return this.subsectiuni.get(index);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare + "Subsectiunea " + super.getDenumire() + " are urmatoarele componente: ");
        for(SectiuniMeniu sm : subsectiuni){
            sm.afiseazaDescriere(identare + "    ");
        }
    }
}
