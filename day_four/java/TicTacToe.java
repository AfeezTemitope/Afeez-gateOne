import java.util.Scanner;

public class TicTacToe{

	public static void main(String...args){
	Scanner scanner = new Scanner(System.in);
	char[][] board = new char[3][3];
	char currentPlayer = 'X';


	for (int index = 0; index < 3; index++){
		for (int  count = 0; count < 3; count++){
		board[index][count] = ' ';

		}

	}
	System.out.println("Welcome let play game!");
	printBoard(board);

	System.out.println(currentPlayer + "'s turn.\nEnter number(1-3) for the row u want to select ");
	int row = scanner.nextInt() - 1;
	System.out.println(currentPlayer + "'s turn.\nEnter number(1-3) for the column ");
	int column = scanner.nextInt() - 1;


	if(isValidMove(board, row, column)){
		board[row][column] = currentPlayer;
	printBoard(board);


	}


	}



	public static void printBoard(char[][] board){
	for( int index = 0; index < 3; index++){
	for ( int count = 0; count < 3; count++){
	System.out.print(board[index][count]);
		if (count < 2 ){
	System.out.print(" | ");
	}

	}
	System.out.println();
		if (index < 2){
	System.out.print("=========\n");
	}
	}

}
	public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

}