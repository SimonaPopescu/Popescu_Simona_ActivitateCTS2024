package teste;

import classes.IPersoana;
import classes.PachetTuristic;
import classes.Persoana;
import jdk.jfr.Category;
import org.junit.Test;
import teste.categorii.CuMock;
import teste.dubluriTeste.PersoanaFake;

import static org.junit.Assert.assertEquals;

public class PachetTuristicTest {

    @Test
    public void corectAplicaDiscount(){
        IPersoana persoana = new Persoana("Simona", "1021118520090");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Italia", 100.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(80, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void aplicaDiscountBoundary(){
        IPersoana client = new Persoana("Dan", "1021118520090");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Monaco", 33.5);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(30.15, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void valoareAplicaDiscountFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Monaco", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(27, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void valoareNuAplicaDiscountFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Monaco", 30.0);
        client.setValoareGetVarsta(25);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(30, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void valoareAplicaDiscount100(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Monaco", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    //@Category(CuMock.class)
    public void valoareAplicaDiscount0(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Monaco", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(30.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void valoareAplicaDiscount1(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Monaco", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(1);
        assertEquals(29.7, pachetTuristic.getPret(), 0.01);
    }
}