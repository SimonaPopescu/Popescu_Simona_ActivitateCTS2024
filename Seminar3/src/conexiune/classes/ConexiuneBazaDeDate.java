package conexiune.classes;

public class ConexiuneBazaDeDate {

    private String numeConexiune;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazaDeDate instanta = null;

    public void setNumeConexiune(String numeConexiune) {
        this.numeConexiune = numeConexiune;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    //Contructor PRIVAT
    private ConexiuneBazaDeDate(String numeConexiune, int nrTabele, String linkConexiune) {
        this.numeConexiune = numeConexiune;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDeDate: " +
                "numeConexiune='" + numeConexiune + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConexiune='" + linkConexiune + '\'' +
                '}';
    }

    public static synchronized ConexiuneBazaDeDate getInstance(String numeConexiune, int nrTabele, String linkConexiune) {
        if (instanta == null) {
            instanta = new ConexiuneBazaDeDate(numeConexiune, nrTabele, linkConexiune);
        }
        return instanta;
    }
}
