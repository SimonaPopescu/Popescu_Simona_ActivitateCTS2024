package classes;

public abstract class StructuraAbstracta {
    private String denumire;

    public StructuraAbstracta(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public abstract void adaugaStructura(StructuraAbstracta sa);
    public abstract void stergeStructura(StructuraAbstracta sa);
    public abstract StructuraAbstracta getStructura(int index);
    public abstract void afiseazaDescriere(String identare);
}
