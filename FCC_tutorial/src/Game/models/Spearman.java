package Game.models;

public class Spearman extends Character {
    private final double DEFENCE_MODIFIER = 0.3;

    public Spearman(String name, double attackRatio, double defenceRatio, double health) {
        super(name, attackRatio, defenceRatio, health);
    }

    @Override
    public double getDefenceRatio() {
        return super.getDefenceRatio() * DEFENCE_MODIFIER;
    }
}
