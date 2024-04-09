package softNou;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bautura> listaBauaturi;

    public Bar(){
        this.listaBauaturi = new ArrayList<>();
    }

    public List<Bautura> getListaBauaturi() {
        return listaBauaturi;
    }

    public void adaugaBautura(Bautura bautura){
        this.listaBauaturi.add(bautura);
    }

    public void printareNota(){
        float total = 0;
        System.out.println("Lista de bauturi este: ");
        for (Bautura bautura: listaBauaturi){
            System.out.println(bautura);
            total = total + bautura.getPret();
        }
        System.out.println("Totalul este: " + total);
    }
}
