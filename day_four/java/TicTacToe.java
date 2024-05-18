																																																																																																																																																																																							import java.util.Scanner;

public class TicTacToe {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        char currentPlayer = 'X';

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

       
        while (true) {
            System.out.println(currentPlayer + "'s turn.");
            printBoard(board);

            int row;
            int col;
            while (true) {
                System.out.println("Enter row (1-3): ");
                row = scanner.nextInt() - 1;
                System.out.println("Enter column (1-3): ");
                col = scanner.nextInt() - 1;

                if (isValidMove(board, row, col)) {
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            board[row][col] = currentPlayer;

           
            if (checkWin(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                printBoard(board);
                break;
            }

           
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public static boolean checkWin(char[][] board, char player) {
        
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}
