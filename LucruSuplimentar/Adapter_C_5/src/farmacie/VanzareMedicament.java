package farmacie;

public class VanzareMedicament implements Farmacie{
    Medicament medicament;

    public VanzareMedicament() {
    }

    public VanzareMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    @Override
    public void setareMedicmanet(int id) {
        this.medicament.setIdMedicament(id);
        System.out.println("A fost setat id-ul medicamentului.");
    }

    @Override
    public boolean verificareDisponibilitate(int nrMedDorite) {
        if(this.medicament.getNrMedcamente() > nrMedDorite){
            return true;
        }
        return false;
    }
}
