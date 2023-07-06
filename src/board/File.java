package board;

public enum File {
    FILE_A(0),FILE_B(1),FILE_C(2),FILE_D(3),FILE_E(4),FILE_F(5),FILE_G(6),FILE_H(7), FILE_NONE(8);

    private final int value;


    File(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
