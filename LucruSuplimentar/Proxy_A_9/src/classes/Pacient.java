package LucruSuplimentar.Proxy_A_9.src.classes;

public class Pacient {
    private String nume;
    private boolean areAsigurareMedicala;
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isAreAsigurareMedicala() {
        return areAsigurareMedicala;
    }

    public void setAreAsigurareMedicala(boolean areAsigurareMedicala) {
        this.areAsigurareMedicala = areAsigurareMedicala;
    }

    public Pacient(String nume, boolean areAsigurareMedicala) {
        this.nume = nume;
        this.areAsigurareMedicala = areAsigurareMedicala;
    }
}
