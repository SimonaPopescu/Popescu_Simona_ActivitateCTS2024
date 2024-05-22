package decorator;

import classes.BiletAbstract;

public class MesajSustinere extends Decorator{
    public MesajSustinere(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printareMesaj() {
        if(super.isEchipaLocala() == true){
            System.out.println("Joaca echipa locala! Mult suces!");
        } else {
            System.out.println("NU joaca echipa locala! Pacat!");
        }
    }


}
