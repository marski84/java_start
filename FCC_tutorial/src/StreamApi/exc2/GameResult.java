package StreamApi.exc2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class GameResult {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;


}
