package softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie{
    List<Produs> listaProduse;

    public Bucatarie() {
        this.listaProduse = new ArrayList<>();
    }

    public List<Produs> getListaProduse() {
        return listaProduse;
    }

    public void adaugareProdus(Produs produs){
        this.listaProduse.add(produs);
    }

    @Override
    public String toString() {
        return "Bucatarie{" +
                "listaProduse=" + listaProduse +
                '}';
    }

    @Override
    public void printareBon(){
        System.out.println("Lista de produse este: ");
        float total=0;
        for(Produs produs: listaProduse){
            System.out.println(produs);
            total = total + produs.getPret();
        }
        System.out.println("Pretul total este: " + total);
    }
}
