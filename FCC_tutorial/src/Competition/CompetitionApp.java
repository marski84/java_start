package Competition;

import java.util.InputMismatchException;

class CompetitionApp
{
    public static void main(String[] args) {
        try {
            CompetitionController competitionController = new CompetitionController();
            competitionController.run();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        CompetitionController competitionController = new CompetitionController();
        competitionController.run();
    }
}