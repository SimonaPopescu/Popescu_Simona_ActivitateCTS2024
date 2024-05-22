package LucruSuplimentar.Proxy_A_9.src.classes;

public class Proxy implements Internare{
    public InternarePacient internarePacient;

    public Proxy(InternarePacient internarePacient) {
        this.internarePacient = internarePacient;
    }

    @Override
    public void internare(Pacient pacient) {
        if(pacient.isAreAsigurareMedicala() == true){
            internarePacient.internare(pacient);
            System.out.println("Pacientul " + pacient.getNume() + " are asigurare si a fost internat");
        } else{
            System.out.println("Pacientul " + pacient.getNume() + " nu are asigurare si nu a fost internat");

        }
    }
}
