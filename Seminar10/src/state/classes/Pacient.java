package state.classes;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internat();
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Stare getStare() {
        return stare;
    }

    public void agravareStare(){
        if(this.stare instanceof Internat){
            Stare stare = new SubObservatie();
            stare.setareStare(this);

            System.out.println("Starea pacientului"  + this.nume + " este grava!");
        } else {
            System.out.println("Pacientul " + this.nume + " nu este internat");
        }
    }

    public void vindecare(){
        if(this.stare instanceof Internat){
            Stare stare = new Externat();
            stare.setareStare(this);

            System.out.println("Pacientul"  + this.nume + " este externat!");
        }
        System.out.println("Pacientul " + this.nume + " nu este internat");
    }
}
