package pekan6;

	import java.util.Scanner;

	public class TicTacToe {
	    private char[][] board;
	    private char currentPlayer;

	    public TicTacToe() {
	        board = new char[3][3];
	        currentPlayer = 'X';
	        initializeBoard();
	    }

	    private void initializeBoard() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                board[i][j] = '-';
	            }
	        }
	    }

	    private void printBoard() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    private boolean isBoardFull() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (board[i][j] == '-') {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    private boolean makeMove(int row, int col) {
	        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
	            board[row][col] = currentPlayer;
	            return true;
	        }
	        return false;
	    }

	    private boolean checkWin() {
	        // Implement your win-checking logic here
	        // For simplicity, let's start with a simple check for three in a row horizontally
	        for (int i = 0; i < 3; i++) {
	            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public void playGame() {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            printBoard();

	            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
	            int row = scanner.nextInt();
	            int col = scanner.nextInt();

	            if (makeMove(row, col)) {
	                if (checkWin()) {
	                    printBoard();
	                    System.out.println("Player " + currentPlayer + " wins!");
	                    break;
	                } else if (isBoardFull()) {
	                    printBoard();
	                    System.out.println("The game is a draw!");
	                    break;
	                } else {
	                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	                }
	            } else {
	                System.out.println("Invalid move. Try again.");
	            }
	        }

	        scanner.close();
	    }

	    public static void main(String[] args) {
	        TicTacToe game = new TicTacToe();
	        game.playGame();
	    }
	}


