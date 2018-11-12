package homework3;

import java.util.Scanner;

public class TicTacToe {
	
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
		board[1][1] = 2;
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
			
			
			if(board[firstNum][secondNum] == 0) {
				board[firstNum][secondNum] = 1;
				correctInput = true;
			}
			else if(input >= 0 && input <= 8){
				System.out.println("There is already something in that spot");
				correctInput = false; 
			}
			else {
				System.out.println("Enter a number 0-8");
			}
		}
		numOfTurns++;
		if(numOfTurns == 1) {
			if(input != 0) {
				board[0][0] = 2;
			}
			else {
				board[2][2] = 2;
			}
		}
		if(numOfTurns == 2) {
			if(board[0][0] == 1 && board[0][2] == 1 && board[0][1] == 0) {
				board[0][1] = 2;
			}
			else if(board[0][0] == 1 && board[2][0] == 1 && board[1][0] == 0) {
				board[1][0] = 2;
			}
			else if(board[2][2] == 1 && board[0][2] == 1 && board[1][2] == 0) {
				board[1][2] = 2;
			}
			else if(board[2][0] == 1 && board[2][2] == 1 && board[2][1] == 0) {
				board[2][1] = 2;
			}
			else if(board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 0) {
				board[2][2] = 2;
			}
			else if(board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 0) {
				board[2][0] = 2;
			}
			else if(board[1][2] == 1 && board[2][2] == 1 && board[0][2] == 0) {
				board[0][2] = 2;
			}
			else if(board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 0) {
				board[2][2] = 2;
			}
			else if(board[2][2] == 1 && board[2][1] == 1 && board[2][0] == 0) {
				board[2][0] = 2;
			}
			else if(board[0][2] == 0) {
				board[0][2] = 2;
			}
			else if(board[2][0] == 0) {
				board[2][0] = 2;
			}
			else {
				board[2][2] = 2;
			}
		}
		if(numOfTurns > 2) {
			System.out.println(board[0][0]);
			System.out.println(board[2][0]);
			if(board[0][0] == 1 && board[0][2] == 1 && board[0][1] == 0) {
				board[0][1] = 2;
			}
			else if(board[0][0] == 1 && board[2][0] == 1 && board[1][0] == 0) {
				board[1][0] = 2;
			}
			else if(board[2][2] == 1 && board[0][2] == 1 && board[1][2] == 0) {
				board[1][2] = 2;
			}
			else if(board[2][0] == 1 && board[2][2] == 1 && board[2][1] == 0) {
				board[2][1] = 2;
			}
			else if(board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 0) {
				board[2][2] = 2;
			}
			else if(board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 0) {
				board[2][0] = 2;
			}
			else if(board[1][2] == 1 && board[2][2] == 1 && board[2][2] == 0) {
				board[2][2] = 2;
			}
			else if(board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 0) {
				board[2][2] = 2;
			}
			else {
				boolean breakHelp = false;
				for(int i = 0; i < board.length; i++) {
					if(breakHelp) {
						break;
					}
					for(int r = 0; r < board[i].length; r++) {
						if(board[i][r] == 0) {
							board[i][r] = 2;
							breakHelp = true;
							break;
						}
					}
				}
			}
		}
	}
	
	public static boolean isFinished() {
		boolean boardFull = true;
		for(int i = 0; i < board.length; i++) {
			for(int r = 0; r < board[i].length; r++) {
				if(board[i][r] == 0) {
					boardFull = false;
				}
			}
		}
		if(boardFull) {
			return true;
		}
		if((board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != 0) ||
		   (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != 0) ||
		   (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != 0) ||
		   (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != 0) ||
		   (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != 0) ||
		   (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != 0) ||
		   (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) ||
		   (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != 0)) {
			return true;
		}
		return false;
	}
}
