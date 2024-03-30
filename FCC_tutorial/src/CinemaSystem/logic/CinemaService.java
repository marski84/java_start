package CinemaSystem.logic;

import CinemaSystem.models.Client;
import CinemaSystem.models.Movie;
import CinemaSystem.models.Ticket;

public class CinemaService {

    public void handleTicketSale(Client client, Movie movie) {
        if (movie.getFreeSeats() == 0) {
            this.printInfo("Not free seats available!");
        } else if (client.getAge1() < movie.getAgeRequired()) {
            this.printInfo("Movie available for people over " +movie.getAgeRequired());
        } else {
            Ticket ticket = new Ticket(client, movie.getMovieTitle());
            movie.decreaseFreeSeats();
            this.confirmTicketPurchase(movie);
        }

    }

    private void printInfo(String info) {
        System.out.println(info);
    }

    private void printInfo(int info) {
        System.out.println(info);
    }

    private void confirmTicketPurchase(Movie movie) {
        System.out.println("Available seats left: " + movie.getFreeSeats());
        System.out.println("Amount of sold tickets: " + (movie.getMaxSeats() - movie.getFreeSeats()));
    }
}
