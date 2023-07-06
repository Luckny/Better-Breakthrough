package board;

public class BoardUtils {
    public static final int BRD_SQ_NUM = 100;

    public static int[] convert120To64 = new int[BRD_SQ_NUM];
    public static int[] convert64To120 = new int[64];

    public static int fileAndRankToSquare(File file, Rank rank) {
        return (11 + file.getValue()) + (rank.getValue() * 10);
    }
}
