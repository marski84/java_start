package Set.exc2;

public enum Decision {
    ADD(0),
    EXIT(1),
    REPLACE(1);

    int decisionValue;

    int getDecisionValue() {
        return decisionValue;
    }

    Decision(int value) {
        this.decisionValue = value;
    }
}
