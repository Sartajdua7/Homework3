package homework3;

import java.util.Scanner;

public class TicTacToe2 {
	
	static int[][] board = new int[3][3];
	static Scanner scan = new Scanner(System.in);
	static int numOfTurns;
	
	public static void main(String[] args) {
		resetGame();
		printGuide();
		printBoard();
		while(!isFinished()) {
			playGame();
			printBoard();
		}
		System.out.println("Game Over!");
	}
	public static void resetGame() {
		numOfTurns = 0;
		for(int i = 0; i < board.length; i++) {
			for(int r = 0; r < board[i].length; r++) {
				board[i][r] = 0;
			}
		}
	}
	
	public static void printGuide() {
		System.out.println("Welcome to tic-tac-tow where you never win\n" + 
				"You are O and the computer is X\n" +
				"Here's how to play:\n" + 
				"Enter 0 to mark the top-left\n" +
				"Enter 1 to mark the top-middle\n" +
				"Enter 2 to mark the top-right\n" +
				"Enter 3 to mark the center-left\n" +
				"Enter 4 to mark the center-middle\n" +
				"Enter 5 to mark the center-right\n" +
				"Enter 6 to mark the bottom-left\n" +
				"Enter 7 to mark the bottom-middle\n" +
				"Enter 8 to mark the bottom-right\n"				
				);
	}
	
	public static void printBoard() {
		String status = "";
		for(int i = 0; i < board.length; i++) {
			for(int r = 0; r < board[i].length; r++) {
				switch(board[i][r]){
					case 0:
						status = " ";
						break;
					case 1:
						status = "O";
						break;
					case 2:
						status = "X";
						break;
				}
				if(r == 0 || r == 1) {
					System.out.print(status + "|");
				}
				else {
					System.out.println(status);
				}
			}
		}
	}
	public static void playGame() {
		boolean correctInput = false;
		int input = -1;
		while(!correctInput) {
			input = scan.nextInt();
			int firstNum = input/3;
			int secondNum = input%3;
			
			if(input > 8 || input < 0) {
				System.out.println("Enter a number 0-8");
			}
			else if(board[firstNum][secondNum] == 0) {
				board[firstNum][secondNum] = 1;
				correctInput = true;
			}
			else if(input >= 0 && input <= 8){
				System.out.println("There is already something in that spot");
				correctInput = false; 
			}
		}
		numOfTurns++;
			int[] x = computer();
			board[x[0]][x[1]] = 2;
		}
		
	
	
	public static boolean isFinished() {
		boolean boardFull = true;
		for(int i = 0; i < board.length; i++) {
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				if(board[0][i] == 1) {
					System.out.println("You Won!!");
					return true;
				}
				if(board[0][i] == 2) {
					System.out.println("You lost");
					return true;
				}
			}
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				if(board[i][0] == 1) {
					System.out.println("You Won!!");
					return true;
				}
				if(board[i][0] == 2) {
					System.out.println("You lost");
					return true;
				}
			}
		}
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			if(board[0][0] == 1) {
				System.out.println("You Won!!");
				return true;
			}
			if(board[0][0] == 2) {
				System.out.println("You lost");
				return true;
			}
		}
		if(board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			if(board[0][2] == 1) {
				System.out.println("You Won!!");
				return true;
			}
			if(board[0][2] == 2) {
				System.out.println("You lost");
				return true;
			}
		}
		for(int i = 0; i < board.length; i++) {
			for(int r = 0; r < board[i].length; r++) {
				if(board[i][r] == 0) {
					boardFull = false;
				}
			}
		}
		if(boardFull) {
			System.out.println("It's a tie");
			return true;
		}
		return false;
	}
	
	public static int[] computer() {
		int[] x = new int[2];
		if(numOfTurns == 1) {
			if(board[0][0] == 1) {
				x[0] = 2;
				x[1] = 2;
				return x;
			}
			else if(board[2][0] == 1) {
				x[0] = 0;
				x[1] = 2;
				return x;
			}
			else if(board[0][2] == 1) {
				x[0] = 2;
				x[1] = 0;
				return x;
			}
			else if(board[2][2] == 1) {
				x[0] = 0;
				x[1] = 0;
				return x;
			}
			else if(board[1][1] == 0) {
				x[0] = 1;
				x[1] = 1;
				return x;
			}
			else {
				x[0] = 0;
				x[1] = 0;
				return x;
			}
		}
		if(numOfTurns >= 2) {
			for(int i = 0; i < board.length-1; i++) {
				for(int r = 0; r < board.length; r++) {
					if(board[r][i] == 1 && board[r][i+1] == 1) {
						if(i == 1 && board[r][0] == 0) {
							x[0] = r;
							x[1] = 0;
							return x;
						}
						else if(i+2 <= 2) {
							if(board[r][i+2] == 0){
							x[0] = r;
							x[1] = i+2;
							return x;
							}
						}
					}
					if(board[i][r] == 1 && board[i+1][r] == 1) {
						if(i == 1 && board[0][r] == 0) {
							x[0] = 0;
							x[1] = r;
							return x;
						}
						else if(i+2 <= 2) {
							if(board[i+2][r] == 0){
							x[0] = i+2;
							x[1] = r;
							return x;
							}
					}
					}
				}
			}
			for(int i = 0; i < board.length; i++) {
				if(board[i][0] == 1 && board[i][2] == 1 && board[i][1] == 0) {
					x[0] = i;
					x[1] = 1;
					return x;
				}
				if(board[0][i] == 1 && board[2][i] == 1 && board[1][i] == 0) {
					x[0] = 1;
					x[1] = i;
					return x;
				}
			}
			if(board[0][0] == 1 && board[2][2] == 1 && board[1][1] == 0) {
				x[0] = 1;
				x[1] = 1;
				return x;
			}
			else if(board[2][0] == 1 && board[0][2] == 1 && board[1][1] == 0) {
				x[0] = 1;
				x[1] = 1;
				return x;
			}
			else if(board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 0) {
				x[0] = 2;
				x[1] = 2;
				return x;
			}
			else if(board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 0) {
				x[0] = 0;
				x[1] = 2;
				return x;
			}
			else if(board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 0) {
				x[0] = 2;
				x[1] = 0;
				return x;
			}
			else if(board[2][2] == 1 && board[1][1] == 1 && board[0][0] == 0) {
				x[0] = 0;
				x[1] = 0;
				return x;
			}
			}
		for(int i = 0; i < board.length; i++ ) {
			for(int r = 0; r < board.length; r++) {
				if(board[i][r] == 0) {
					x[0] = i;
					x[1] = r;
					return x;
				}
			}
		}
		return x;
	}
}
