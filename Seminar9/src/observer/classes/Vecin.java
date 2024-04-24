package observer.classes;

public class Vecin implements Observer{
    private float distanta;
    private String nume;

    public Vecin(float distanta, String nume) {
        this.distanta = distanta;
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + ", la distanta de " + distanta + " m de tine a trimis catre abonati urmatorul mesaj: " + mesaj);
    }
}
