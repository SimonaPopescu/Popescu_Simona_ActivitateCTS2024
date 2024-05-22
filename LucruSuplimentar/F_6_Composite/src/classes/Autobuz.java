package classes;

public class Autobuz extends StructuraAbstracta{
    private String producator;
    private String model;
    private int ndLocuri;

    public Autobuz(String denumire, String producator, String model, int ndLocuri) {
        super(denumire);
        this.producator = producator;
        this.model = model;
        this.ndLocuri = ndLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "producator='" + producator + '\'' +
                ", model='" + model + '\'' +
                ", ndLocuri=" + ndLocuri +
                '}';
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare + "Autobuzul " + this.denumire
                + ", avand modelul " + this.model
                + " are producatorul" + this.producator);
    }

    @Override
    public void adaugareStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();

    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        throw new UnsupportedOperationException();
    }
}
