package enumExc1;

public enum Pizza {
//    private final String TOMATO_SAUCE = "sos pomidorowy";
//    private final String CHEESE = "ser";
//    private final String MUSHROOM = "pieczarki";
//    private final String HAM = "szynka";

    MARGHERITA ("sos pomidorowy + ser"),
    CAPRICIOSA ("sos pomidorowy + ser + pieczarki"),
    PROSCIUTTO ("sos pomidorowy + ser + szynka");

    private final String description;

    Pizza(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
