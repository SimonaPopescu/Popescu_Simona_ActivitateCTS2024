package aplicatieNoua;

public class MedicamentAplicatie {

    private int idMedicament;
    private int nrMedcamente;

    public MedicamentAplicatie(int idMedicament, int nrMedcamente) {
        this.idMedicament = idMedicament;
        this.nrMedcamente = nrMedcamente;
    }

    public int getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(int idMedicament) {
        this.idMedicament = idMedicament;
    }

    public int getNrMedcamente() {
        return nrMedcamente;
    }

    public void setNrMedcamente(int nrMedcamente) {
        this.nrMedcamente = nrMedcamente;
    }
}
