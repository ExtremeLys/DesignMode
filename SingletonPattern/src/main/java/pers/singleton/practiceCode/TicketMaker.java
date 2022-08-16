package pers.singleton.practiceCode;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
    }

    private int ticket = 1000;
    public synchronized int getNextTicketNumber(){
        return ticket ++ ;
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }
}
