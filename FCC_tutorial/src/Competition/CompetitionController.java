package Competition;

import Competition.exceptions.AgeViolationException;
import Competition.exceptions.DuplicateException;
import Competition.exceptions.MaxCompetitorsException;

import java.util.InputMismatchException;
import java.util.Scanner;

class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        Boolean competitionCreated = false;
        Competition competition = null;
        while (!competitionCreated) {
            competition = createCompetition();
            competitionCreated = true;
        }
        while (competition.hasFreeSpots()) {
            fillParticipantsInfo(competition);
        }
        printCompetition(competition);

    }

    private Competition createCompetition() {
        Competition competition = null;
        try {
            System.out.print("Podaj nazwę zawodów: ");
            String competitionName = getValidStringInput();
            System.out.print("Podaj maksymalną liczbę uczestników: ");
            int maxParticipants = getValidIntInput();
            System.out.print("Podaj ograniczenie wiekowe: ");
            int ageLimit = getValidIntInput();
            competition = new Competition(competitionName, maxParticipants, ageLimit);

        } catch (InputMismatchException e) {
            System.out.println("createCompetition cathc");
            System.out.println(e);
        } finally {
            scanner.nextLine();
        }

        return competition;
    }

    private String getValidStringInput() {
        String input = "";
        boolean isValid = false;

        while (!isValid) {
            try {
                input = scanner.nextLine();
                isValid = true;
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Not valid inout- please provide text value!");
            }
        }
        return input;
    }

    private int getValidIntInput() {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("wyjatek");
                    throw new InputMismatchException();
                }
                isValid = true;
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Not valid input- please provide number which is greater than 0!");
            } finally {
//                scanner.nextLine();
            }
        }
        return number;
    }

    private void fillParticipantsInfo(Competition competition) {
        try {
            while (competition.hasFreeSpots()) {
                System.out.println("Dodaj nowego uczestnika");
                try{
                    Participant participant = createParticipant();
                    competition.addParticipant(participant);
                } catch (InputMismatchException e) {
                    System.out.println("tutaj wyjątek");
                }
            }
        } catch (AgeViolationException | MaxCompetitorsException | InputMismatchException | DuplicateException e) {
            System.out.println(e);
        }

    }

    private Participant createParticipant() {
        Participant participant = null;
        try {
            System.out.print("Podaj imię: ");
            String firstName = getValidStringInput();
            System.out.print("Podaj nazwisko: ");
            String lastName = getValidStringInput();
            System.out.print("Podaj id (np. pesel): ");
            String id = getValidStringInput();
            System.out.print("Podaj wiek: ");
            int age = getValidIntInput();
            scanner.nextLine();
            participant = new Participant(firstName, lastName, id, age);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        return participant;
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }
}