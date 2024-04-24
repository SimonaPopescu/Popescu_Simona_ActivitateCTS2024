package observer.classes;

import java.util.List;

public class Stadion extends Subiect{
    public Stadion(List<Observer> observers) {
        super(observers);
    }

    @Override
    public void notificaFotbal() {

    }

    @Override
    public void notificaVolei() {

    }

    @Override
    public void notificaHandbal() {

    }
}
