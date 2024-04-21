package Competition;

import Competition.exceptions.AgeViolationException;
import Competition.exceptions.DuplicateException;
import Competition.exceptions.MaxCompetitorsException;

import java.util.Scanner;

class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        Competition competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        System.out.print("Podaj nazwę zawodów: ");
        String competitionName = scanner.nextLine();
        System.out.print("Podaj maksymalną liczbę uczestników: ");
        int maxParticipants = scanner.nextInt();
        System.out.print("Podaj ograniczenie wiekowe: ");
        int ageLimit = scanner.nextInt();
        scanner.nextLine();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            Participant participant = createParticipant();
            try{
                competition.addParticipant(participant);
            } catch (AgeViolationException e) {
                System.out.println(e);
            } catch (MaxCompetitorsException e) {
                System.out.println(e);
            } catch (DuplicateException e) {
                System.out.println(e);
            }
        }
    }

    private Participant createParticipant() {
        System.out.print("Podaj imię: ");
        String firstName = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.print("Podaj id (np. pesel): ");
        String id = scanner.nextLine();
        System.out.print("Podaj wiek: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }
}