package Game;

import Game.logic.GameController;
import Game.models.Character;
import Game.models.Spearman;
import Game.models.Swordsman;
import Game.models.Team;

import java.util.Random;

public class GameImpl {
    public static void main(String[] args) throws InterruptedException {
        Random randomNumber = new Random();

        Character bobo = new Swordsman("Bobo", randomNumber.nextDouble(300) +1, randomNumber.nextDouble(150) +1, randomNumber.nextDouble(300) +1);
        Character dabu = new Spearman("Dabu", randomNumber.nextDouble(300) +1, randomNumber.nextDouble(300) +1, randomNumber.nextDouble(300) +1);
        Character berp = new Spearman("Bobo", randomNumber.nextDouble(300) +1, randomNumber.nextDouble(150) +1, randomNumber.nextDouble(300) +1);
        Team blueTeam = new Team("Blue team", bobo, dabu, berp);

        Character peon = new Swordsman("Obob", randomNumber.nextDouble(150) +1, randomNumber.nextDouble(300) +1, randomNumber.nextDouble(300) +1);
        Character knight = new Swordsman("Udabu", randomNumber.nextDouble(300) +1, randomNumber.nextDouble(300) +1, randomNumber.nextDouble(300) +1);
        Character apprentice = new Swordsman("Srabu", randomNumber.nextDouble(150) +1, randomNumber.nextDouble(300) +1, randomNumber.nextDouble(300) +1);
        Team redTeam = new Team("Red team", peon, knight, apprentice);

        GameController game = new GameController(blueTeam, redTeam);
        game.startGame();
    }
}
