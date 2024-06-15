package StreamApi.exc2;

import java.util.*;
import java.util.stream.Stream;

public class app {
    public static void main(String[] args) {
        Random rand = new Random();
        List<GameResult> gameResults = List.of(
                new GameResult("Poland", "Germany", rand.nextInt(10), rand.nextInt(10)),
                new GameResult("Ukraine", "France", rand.nextInt(10), rand.nextInt(10)),
                new GameResult("San Marino", "Spain", rand.nextInt(10), rand.nextInt(10)),
                new GameResult("Italy", "Brasil", rand.nextInt(10), rand.nextInt(10)),
                new GameResult("Ireland", "England", rand.nextInt(10), rand.nextInt(10)),
                new GameResult("Argentina", "Germany", rand.nextInt(10), rand.nextInt(10)),
                new GameResult("Paraguai", "France", rand.nextInt(10), rand.nextInt(10)),
                new GameResult("Portugal", "Spain", rand.nextInt(10), rand.nextInt(10)),
                new GameResult("Maroco", "Portugal", rand.nextInt(10), rand.nextInt(10)),
                new GameResult("Portugal", "Germany", rand.nextInt(10), rand.nextInt(10)),
                new GameResult("Maroco", "Germany", rand.nextInt(10), rand.nextInt(10))
        );
//        getSortedData(gameResults);
//        getTeamDetails(gameResults,"Germany");
        getUniqueTeams(gameResults);
//        getSumOfAllGoals(gameResults);
    }

    public static void getSortedData(List<GameResult> gameResults) {
        gameResults.stream()
                .sorted((r1, r2) -> -Integer.compare(r1.getHomeScore(), r2.getHomeScore()))
                .forEach(game -> System.out.println(game.getAwayTeam()
                        + " - " + game.getHomeTeam() + " (" + game.getAwayScore() + ":" + game.getHomeScore() + " )"));
    }

    public static void getTeamDetails(List<GameResult> gameResults, String team) {
        List<GameResult> awayGames = gameResults.stream()
                .filter(gameResult -> gameResult.getAwayTeam().equals(team))
                .toList();

        List<GameResult> homeGames = gameResults.stream()
                .filter(gameResult -> gameResult.getHomeTeam().equals(team))
                .toList();

        List<List<GameResult>> resultList = new ArrayList<>();
        resultList.add(awayGames);
        resultList.add(homeGames);
        resultList.stream().flatMap(list -> list.stream())
                .toList();
        System.out.println(resultList);
    }

    public static void getUniqueTeams(List<GameResult> gameResult) {
        List<String> homeTeams = gameResult.stream()
                .map(GameResult::getHomeTeam)
                .distinct()
                .toList();
        List<String> awayTeams = gameResult.stream()
                .map(GameResult::getAwayTeam)
                .distinct()
                .toList();

        System.out.println(awayTeams);
        System.out.println(homeTeams);
        List<String> resultList = List.of(homeTeams, awayTeams).stream()
                .flatMap(List::stream)
                .toList()
                .stream()
                .distinct()
                .toList();
        System.out.println(resultList);





//                .forEach(team -> System.out.println(team.getAwayTeam()));
    }

    public static void getSumOfAllGoals(List<GameResult> gameResults) {
        int sumOfAwayGoals = gameResults.stream()
                .map(GameResult::getAwayScore)
                .reduce(0, Integer::sum);

        int sumOfHomeGoals = gameResults.stream()
                .map(GameResult::getHomeScore)
                .reduce(0, Integer::sum);

        System.out.println(sumOfHomeGoals + sumOfAwayGoals);

    }


}


//
//      publi sortedStream = gameResults.stream()
//                .sorted((r1,r2) -> -Integer.compare(r1.getHomeScore(),r2.getHomeScore()))
//                .forEach(game -> System.out.println(game.toString()));
//    }




