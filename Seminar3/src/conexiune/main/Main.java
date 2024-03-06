package conexiune.main;

import conexiune.classes.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance("Conexiune1", 4, "Conexiune1.link1");

        System.out.println(conexiune1);

        conexiune1.setLinkConexiune("Conexiune1.link2");

        System.out.println(conexiune1);
    }
}