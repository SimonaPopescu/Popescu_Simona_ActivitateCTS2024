package classes;

import java.util.List;

public class Banca extends Subiect{
    private String denumireBanca;

    public Banca(List<Observer> observers, String denumireBanca) {
        super(observers);
        this.denumireBanca = denumireBanca;
    }

    @Override
    public void anuntaOferta() {
        String mesaj = "A aparut o oferta!";
        trimitereNotificare(mesaj);
    }
}
