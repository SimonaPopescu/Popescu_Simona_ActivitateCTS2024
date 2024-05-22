package clasees;

public abstract class SectiuniMeniu {
    private String denumire;

    public SectiuniMeniu(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public abstract void adaugaOptiune(SectiuniMeniu om);
    public abstract void stergereOptiune(SectiuniMeniu om);
    public abstract SectiuniMeniu getOptiune(int index);
    public abstract void afiseazaDescriere(String identare);
}
