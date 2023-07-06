package board;

public enum Color {
    RED(0), BLACK(1), BOTH(2);

    private final int value;

    Color(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
