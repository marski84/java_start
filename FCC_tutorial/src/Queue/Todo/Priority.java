package Queue.Todo;

public enum Priority {
    LOW(0),
    MODERATE(1),
    HIGH(2);

    private int priority;
    public int getValue() {
        return this.priority;
    }

    Priority(int i) {
         this.priority = i;
    }
}
