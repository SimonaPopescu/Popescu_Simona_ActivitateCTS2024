package farmacie;

import aplicatieNoua.Aplicatie;
import aplicatieNoua.MedicamentAplicatie;

public class Adapter extends Aplicatie implements Farmacie {
    Medicament medicament;

    public Adapter(MedicamentAplicatie medicamentAplicatie) {
        super(medicamentAplicatie);
    }

    @Override
    public void setareMedicmanet(int id) {
        this.setareMedicmanet(id);
    }

    @Override
    public boolean verificareDisponibilitate(int nrMedDorite) {
        super.verificaStocPentruMedicament(this.medicament.getIdMedicament(), nrMedDorite);
        return false;
    }
}
