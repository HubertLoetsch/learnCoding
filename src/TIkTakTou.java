
public class TIkTakTou {
    public static void main(String[] args) {


        int turn = 0;
        int winner = -1;
        int[] board = new int[9];

        for (int i = 0; i < board.length; i++) {
            board[i] = -1;
        }
        while (winner == -1) {
            winner = checkWinner(board);

        }

        printBoard(board);

    }

    //Wird Gecket wer Gewonnen hat
    public static int checkWinner(int[] boardwinner) {
        int winner = -1;
        if (boardwinner[0] == boardwinner[1] && boardwinner[0] == boardwinner[2] && boardwinner[0] != -1) {
            winner = boardwinner[0];

        } else if (boardwinner[3] == boardwinner[4] && boardwinner[3] == boardwinner[5] && boardwinner[0] != -1) {
            winner = boardwinner[0];

        } else if (boardwinner[6] == boardwinner[7] && boardwinner[6] == boardwinner[8] && boardwinner[0] != -1) {
            winner = boardwinner[6];

        } else if (boardwinner[0] == boardwinner[4] && boardwinner[0] == boardwinner[8] && boardwinner[0] != -1) {
            winner = boardwinner[0];

        } else if (boardwinner[2] == boardwinner[4] && boardwinner[6] == boardwinner[2] && boardwinner[0] != -1) {
            winner = boardwinner[2];

        } else if (boardwinner[0] == boardwinner[3] && boardwinner[0] == boardwinner[6] && boardwinner[0] != -1) {
            winner = boardwinner[0];
        } else if (boardwinner[1] == boardwinner[4] && boardwinner[1] == boardwinner[7] && boardwinner[0] != -1) {
            winner = boardwinner[1];
        } else if (boardwinner[2] == boardwinner[5] && boardwinner[2] == boardwinner[8] && boardwinner[0] != -1) {
            winner = boardwinner[2];
        } else {
            winner = -1;
        }
        return winner;
    }

    //Das ist die abbildung des Board's
    public static void printBoard(int[] myBoard) {
        System.out.println("Hier ist das Board");
        System.out.println(myBoard[0] + "|" + myBoard[1] + "|" + myBoard[2]);
        System.out.println("_________");
        System.out.println(myBoard[3] + "|" + myBoard[4] + "|" + myBoard[5]);
        System.out.println("_________");
        System.out.println(myBoard[6] + "|" + myBoard[7] + "|" + myBoard[8]);
    }
}
