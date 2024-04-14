package Game.models;

public class Character {
    private String name;
    private double attackRatio;
    private double defenceRatio;
    private double health;

    public Character(String name, double attackRatio, double defenceRatio, double health) {
        this.name = name;
        this.attackRatio = attackRatio;
        this.defenceRatio = defenceRatio;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackRatio() {
        return attackRatio;
    }

    public void setAttackRatio(int attackRatio) {
        this.attackRatio = attackRatio;
    }

    public double getDefenceRatio() {
        return defenceRatio;
    }

    public void setDefenceRatio(int defenceRatio) {
        this.defenceRatio = defenceRatio;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
