package CinemaSystem.models;

import java.util.Random;

public class Ticket {
    private int ticketId;
    private Client ticketPersonData;
    private String ticketMovieTitle;
    private Random id = new Random();

    public Ticket(Client ticketPersonData, String ticketMovieTitle) {
        this.ticketId = id.nextInt(10000) + 1;
        this.ticketPersonData = ticketPersonData;
        this.ticketMovieTitle = ticketMovieTitle;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketPersonData() {
        return ticketPersonData.getFirstName() + " " + ticketPersonData.getLastName();
    }

    public void setTicketPersonData(Client ticketPersonData) {
        this.ticketPersonData = ticketPersonData;
    }

    public String getTicket1MovieTitle() {
        return ticketMovieTitle;
    }

    public void setTicket1MovieTitle(String ticket1MovieTitle) {
        this.ticketMovieTitle = ticket1MovieTitle;
    }
}
