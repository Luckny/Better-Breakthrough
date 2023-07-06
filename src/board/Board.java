package board;

import java.util.Arrays;
import java.util.HashMap;

import static board.Color.BOTH;

public class Board {
    public static final int MAXGAMEMOVES = 2048;
    public static final int MAXPOSITIONMOVES = 256;
    public static final int MAXDEPTH = 64;

    public static final String START_FEN = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";

    public static final int INFINITE = 30000;
    public static final int ISMATE = (INFINITE - MAXDEPTH);

    public static final int UCIMODE = 0, XBOARDMODE = 1, CONSOLEMODE = 2;

    public static final int FALSE = 0, TRUE = 1;

    private int[] pieces;
    private long[] pawns;

    private int side;
    private int numMoves;

    private int ply;
    private int historyPly;

    private int castlePerm;

    private long posKey;

    private int[] pceNum;
    private int[] bigPce;
    private int[] majPce;
    private int[] minPce;
    private int[] material;

    private Undo[] history;
    private HashMap hashTable;
    private int[] PvArray;

    private int[][] searchHistory;
    private int[][] searchKillers;

    public Board() {
        pieces = new int[BoardUtils.BRD_SQ_NUM];
        pawns = new long[3];

        pceNum = new int[13];
        material = new int[2];

        history = new Undo[MAXGAMEMOVES];
        hashTable = new HashMap();
        PvArray = new int[MAXDEPTH];

        searchHistory = new int[13][BRD_SQ_NUM];
        searchKillers = new int[2][MAXDEPTH];

        resetBoard();
    }

    public void resetBoard() {
        Arrays.fill(pawns, 0L);
        side = BOTH.getValue();
        numMoves = 0;

        ply = 0;
        hisPly = 0;

        castlePerm = 0;

        posKey = 0L;

        Arrays.fill(pceNum, 0);

        history = new Undo[MAXGAMEMOVES];
        hashTable.clear();

        PvArray = new int[MAXDEPTH];

        for (int i = 0; i < 13; i++) {
            Arrays.fill(searchHistory[i], 0);
        }

        for (int i = 0; i < 2; i++) {
            Arrays.fill(searchKillers[i], 0);
        }
    }

    public void printBoard() {
        // Print the current board state
    }

    public void updateListsMaterial() {
        // Update lists and material
    }

    public boolean checkBoard() {
        // Validate the integrity of the board representation
        return false;
    }

    public void mirrorBoard() {
        // Mirror the board horizontally
    }

    public static int fr2Sq(int file, int rank) {
        return 21 + file + (rank * 10);
    }

    public static int sq64(int sq120) {
        return Sq120ToSq64[sq120];
    }

    public static int sq120(int sq64) {
        return Sq64ToSq120[sq64];
    }

    public static int popBit(long[] bb) {
        // Pop a bit from the bitboard
        return 0;
    }

    public static int countBits(long b) {
        // Count the number of set bits in a bitboard
        return 0;
    }

    public static void clrBit(long[] bb, int sq) {
        // Clear a bit in the bitboard at the given square
    }

    public static void setBit(long[] bb, int sq) {
        // Set a bit in the bitboard at the given square
    }

    public static boolean isBQ(int p) {
        return PieceBishopQueen[p];
    }

    public static boolean isRQ(int p) {
        return PieceRookQueen[p];
    }

    public static boolean isKn(int p) {
        return PieceKnight[p];
    }

    public static boolean isKi(int p) {
        return PieceKing[p];
    }

    public static int mirror64(int sq) {
        return Mirror64[sq];
    }
}
