package clasees;

public class Item extends SectiuniMeniu{

    private float pret;

    public Item(String denumire, float pret) {
        super(denumire);
        this.pret = pret;
    }

    @Override
    public void adaugaOptiune(SectiuniMeniu om) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereOptiune(SectiuniMeniu om) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SectiuniMeniu getOptiune(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare +
                "Itemul "+
                super.getDenumire() + " are pretul de " +
                this.pret + " ron"
        );
    }
}
