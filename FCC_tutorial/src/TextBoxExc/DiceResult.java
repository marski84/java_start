package TextBoxExc;

public enum DiceResult {
    ONE(1, """
     - - - - -
    |         |
    |    0    |
    |         |
     - - - - -
"""),
    TWO(2, """
     - - - - -
    | 0       |
    |         |
    |       0 |
     - - - - -
"""),
    THREE(3, """
     - - - - -
    | 0       |
    |    0    |
    |       0 |
     - - - - -
"""),
    FOUR(4, """
     - - - - -
    | 0     0 |
    |         |
    | 0     0 |
     - - - - -
"""),
    FIVE(5, """
     - - - - -
    | 0     0 |
    |    0    |
    | 0     0 |
     - - - - -
"""),
    SIX(6, """
     - - - - -
    | 0     0 |
    | 0     0 |
    | 0     0 |
     - - - - -
""");

    private int id;
    private String value;


    DiceResult(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }
}
