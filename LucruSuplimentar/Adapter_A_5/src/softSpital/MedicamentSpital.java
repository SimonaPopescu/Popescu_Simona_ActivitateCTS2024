package softSpital;

public class MedicamentSpital implements CumparareMedicamentSpital{
    private String numeMedicament;
    private boolean areReteta;

    public MedicamentSpital(String numeMedicament, boolean areReteta) {
        this.numeMedicament = numeMedicament;
        this.areReteta = areReteta;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public boolean isAreReteta() {
        return areReteta;
    }

    public void setAreReteta(boolean areReteta) {
        this.areReteta = areReteta;
    }

    @Override
    public void achizitioneazaMedicament() {
        if(isAreReteta() == true){
            System.out.println("S-a achizitionat medicamentul " + numeMedicament);
        } else{
            System.out.println("NU s-a achizitionat medicamentul " + numeMedicament + ", nu are reteta!");
        }
        prezintaReteta();
    }

    @Override
    public void prezintaReteta() {
        if(isAreReteta() == true){
            System.out.println("Mediacmentul " + numeMedicament + " are reteta");
        } else{
            System.out.println("Mediacmentul " + numeMedicament + " NU are reteta");

        }
    }
}
