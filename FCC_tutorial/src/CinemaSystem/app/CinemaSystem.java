package CinemaSystem.app;

import CinemaSystem.logic.CinemaService;
import CinemaSystem.models.Client;
import CinemaSystem.models.Movie;

class CinemaSystem {
    public static void main(String[] args) {
        CinemaService cinemaService = new CinemaService();
        Movie movie = new Movie("Omen", "horror", 120, 16, 72, 72);

        Client underAgeClient = new Client("Jan", "Nieletni", 12);
        Client matureClient = new Client("Testowy", "Testowy", 30);

        cinemaService.handleTicketSale(underAgeClient, movie);
        cinemaService.handleTicketSale(matureClient, movie);





}}

