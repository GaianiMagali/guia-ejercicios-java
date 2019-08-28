package ar.edu.unahur.obj2.ejercicio1;

import ar.edu.unahur.obj2.ejercicio1.Ticket.LineaTicket;
import ar.edu.unahur.obj2.ejercicio1.Ticket.Ticket;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Supermercado {

    Ticket t1;
    LineaTicket lineaTicket1;

    @BeforeTest
    public void setup() {
        t1 = new Ticket("notebook", 100.10, 10);
        lineaTicket1 = new LineaTicket();
        lineaTicket1.agregarTicket(t1);
    }

    @Test
    public void Testempleados() {
        System.out.println(lineaTicket1.getTicket());
    }
}


