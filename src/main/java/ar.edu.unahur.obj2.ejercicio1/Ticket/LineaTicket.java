package ar.edu.unahur.obj2.ejercicio1.Ticket;

import ar.edu.unahur.obj2.ejercicio1.Ticket.Ticket;

import java.util.ArrayList;

public class LineaTicket {
    public ArrayList<Ticket> tickets = new ArrayList();

    public void agregarTicket(Ticket tickets) {
        this.tickets.add(tickets);
    }

    public ArrayList<Ticket> getTicket(){
        return tickets;
    }

}





