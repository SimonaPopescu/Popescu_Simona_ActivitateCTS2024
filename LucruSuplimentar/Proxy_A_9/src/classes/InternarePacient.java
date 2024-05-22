package LucruSuplimentar.Proxy_A_9.src.classes;

public class InternarePacient implements Internare{
    private int nrCamera;

    public InternarePacient(int nrCamera) {
        this.nrCamera = nrCamera;
    }
    @Override
    public void internare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume()
                + " s-a internat in camera " + this.nrCamera);
    }
}
