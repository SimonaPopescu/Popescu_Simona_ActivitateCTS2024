package classes;

import observer.Observer;

import java.util.List;

public class Restaurant extends Subiect{
    private String nume;

    public Restaurant(List<Observer> observers, String nume) {
        super(observers);
        this.nume = nume;
    }


    @Override
    public void notificareOferta() {
        String mesaj = "Exista o oferta noua!";
        this.trimitereNotificare(mesaj);
    }

    @Override
    public void notificareMeniu() {
        String mesaj = "Exista un meniu nou!";
        this.trimitereNotificare(mesaj);
    }
}
