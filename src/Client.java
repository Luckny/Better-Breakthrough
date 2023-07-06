import board.BoardUtils;

import static board.Rank.*;

import static board.File.*;
import static board.Square.*;

public class Client {
    public static void main(String[] args) {
        init();
    }


    private static void init(){
        int index = 0;
        int file = FILE_A.getValue();
        int rank = RANK_1.getValue();

        int square  = A1.getValue();
        int square64  = 0;
        for(index = 0; index < BoardUtils.BRD_SQ_NUM; index++){
            BoardUtils.convert64To120[index] =
        }
    }
}
