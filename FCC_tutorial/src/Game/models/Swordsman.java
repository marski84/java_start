package Game.models;

public class Swordsman extends Character {
    private final double ATTACK_MODIFIER = 0.25;

    public Swordsman(String name, double attackRatio, double defenceRatio, double health) {
        super(name, attackRatio, defenceRatio, health);
    }

    @Override
    public double getAttackRatio() {
        return super.getAttackRatio() * ATTACK_MODIFIER;
    }
}
