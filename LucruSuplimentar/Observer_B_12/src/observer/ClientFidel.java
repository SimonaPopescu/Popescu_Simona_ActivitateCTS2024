package observer;

public class ClientFidel implements Observer{
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    public void receptionareMesaj(String mesaj){
        System.out.println(nume + ", ai primit urmatorul mesaj: " + mesaj);
    }
}
