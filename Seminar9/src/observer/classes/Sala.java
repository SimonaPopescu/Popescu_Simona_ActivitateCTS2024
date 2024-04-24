package observer.classes;

import java.util.List;

public class Sala extends Subiect{
    String numeSala;

    public Sala(List<Observer> observers, String numeSala) {
        super(observers);
        this.numeSala = numeSala;
    }

    public Sala(List<Observer> observers) {
        super(observers);
    }
    @Override
    public void notificaFotbal() {
        String mesaj= "Va avea loc un meci de fotbal pe data de 23";
        notificareAbonati(mesaj);
    }

    @Override
    public void notificaVolei() {
        String mesaj= "Va avea loc un meci de volei pe data de 23";
        notificareAbonati(mesaj);
    }

    @Override
    public void notificaHandbal() {
        String mesaj= "Va avea loc un meci de handbal pe data de 23";
        notificareAbonati(mesaj);
    }
}
