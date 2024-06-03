package Queue.Todo;

public enum AppMode {
    ADD_TASK(1),
    POLL_TASK(2),
    EXIT(3);

    private int value;

    AppMode(int i) {
        this.value = i;
    }

    int getValue() {
        return this.value;
    }
}
