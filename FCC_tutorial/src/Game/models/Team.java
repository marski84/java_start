package Game.models;

public class Team {
    private final int TEAM_SIZE= 3;
    private String teamName;
    private double attack;
    private double defence;
    private double health;
    private Character[] team = new Character[TEAM_SIZE];

    public Team(String teamName, Character firstMember, Character secondMember, Character thirdMember) {
        this.teamName = teamName;
        team[0] = firstMember;
        team[1] = secondMember;
        team[2] = thirdMember;

        this.attack = this.calculateAttackValue();
        this.defence = this.calculateDefenceValue();
        this.health = this.calculateEnergyValue();
    }

    private double calculateAttackValue() {
        double teamAttack = 0;
        for (Character teamMember : team) {
            teamAttack += teamMember.getAttackRatio();
        }
        return teamAttack;
    }
    private double calculateDefenceValue() {
        double teamDefence = 0;
        for (Character teamMember : team) {
            teamDefence += teamMember.getDefenceRatio();
        }
        return teamDefence;
    }

    private double calculateEnergyValue() {
        double teamEnergy = 0;
        for (Character teamMember : team) {
            teamEnergy += teamMember.getHealth();
        }
        return teamEnergy;
    }

    public void modifyHealth(double healthAmount) {
        setHealth(getHealth() - healthAmount);
        if (health <= healthAmount) {

            System.out.println("Team" + teamName + " loses!");
            return;
        }
    }

    public void printTeamParams() {
        System.out.println("Name: " + getTeamName());
        System.out.println("Attack: " + getAttack());
        System.out.println("Defence: " + getDefence());
        System.out.println("Health: " + getHealth());
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
