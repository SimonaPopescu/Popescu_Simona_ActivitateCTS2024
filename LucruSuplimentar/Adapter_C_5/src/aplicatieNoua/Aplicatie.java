package aplicatieNoua;

public class Aplicatie {
    MedicamentAplicatie medicamentAplicatie;

    public Aplicatie(MedicamentAplicatie medicamentAplicatie) {
        this.medicamentAplicatie = medicamentAplicatie;
    }

    public boolean verificaStocPentruMedicament(int id, int nrMedDorit){
        if(this.medicamentAplicatie.getIdMedicament() == id && this.medicamentAplicatie.getNrMedcamente()>nrMedDorit){
            return true;
        }
        return false;
    }
}
