package classes;

public abstract class StructuraAbstracta {
    String denumire;

    public StructuraAbstracta(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public abstract void afiseazaDescriere(String identare);
    public abstract void adaugareStructura(StructuraAbstracta sa);
    public abstract void stergereStructura(StructuraAbstracta sa);
    public abstract StructuraAbstracta getStructura(int index);

}
