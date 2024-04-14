package Game.logic;

import Game.models.Team;

import java.util.Random;

public class GameController {
    private Team[] teamsInTournament = new Team[2];
    private Random ran= new Random();
    private boolean firstRound = true;
    private int startingTeamIndex;
    private boolean firstTeamTurn;

    public GameController(Team first, Team second) {
        teamsInTournament[0] = first;
        teamsInTournament[1] = second;
    }

    public void startGame() throws InterruptedException {
        Team first = teamsInTournament[0];
        Team second = teamsInTournament[1];


        while(first.getHealth() > 0 && second.getHealth() > 0) {
            first.printTeamParams();
            second.printTeamParams();
            if (firstRound) {
                startingTeamIndex = drawOddOrEven() == 0 ? 0 : 1;
                this.handleTeamAttack(startingTeamIndex);
                this.firstRound = false;
            }

            if (firstTeamTurn) {
                this.handleTeamAttack(0);
            } else {
                this.handleTeamAttack(1);
            }

            if(first.getHealth() <= 0 || second.getHealth() <=0) {
                first.printTeamParams();
                second.printTeamParams();
            }
        }
    }

    private int drawOddOrEven() {
        return ran.nextInt(100) % 2;
    }

    private void handleTeamAttack(int teamIndex) {
        int attackingTeamAttackValue = (int) teamsInTournament[teamIndex].getAttack();
        int defendingTeamIndex = teamIndex == 0 ? 1: 0;
        int defendingTeamDefenceValue = (int) teamsInTournament[defendingTeamIndex].getDefence();
        int defendingTeamDamage = attackingTeamAttackValue - defendingTeamDefenceValue;
        System.out.println("damage " + defendingTeamDamage);
        if (defendingTeamDamage > 0) {
            this.teamsInTournament[defendingTeamIndex].modifyHealth(defendingTeamDamage);
        }
        if (teamIndex == 0) {
            this.firstTeamTurn = false;
        } else {
            this.firstTeamTurn = true;
        }
    }
}
