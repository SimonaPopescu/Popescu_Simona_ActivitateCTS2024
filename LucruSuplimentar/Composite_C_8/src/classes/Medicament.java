package classes;

public class Medicament extends StructuraAbstracta{
    private boolean isDisponibil;

    public Medicament(String denumire, boolean isDisponibil) {
        super(denumire);
        this.isDisponibil = isDisponibil;
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare + "Medicamentul " +
                super.getDenumire() +
                (this.isDisponibil ? "" : " nu") + " este disponibil");
    }
}
