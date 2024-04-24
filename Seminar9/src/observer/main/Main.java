package observer.main;

import observer.classes.*;

// Observer + primesteNotificare(String mesaj)
// Abonat + primesteNotificare()
// Clasa abstracta Subiect: listaObservatori, + adaugareObservator(Observator obs); + stergeObservator(Observator observator); + trimitereNotificare(String mesaj)
// Sala: numeSala + trimiteNotificare(); notificaFotbal(); notificaVolei(); notificaHandbal();
public class Main {
    public static void main(String[] args) {
        Observer abonat1 = new Abonat("Gigel1");
        Observer abonat2 = new Abonat("Gigel2");
        Observer abonat3 = new Abonat("Gigel3");
        Observer vecin = new Vecin(12, "Gigel");
    }

}