package com.TicTacToe.java;
class CreateBoard {
	//public char board[] = new char[10];
	public char board[] = new char[10];
	public  char[] createBoard() {
	for (int i=1; i<10; i++) {
		board[i] = ' ' ;
	}
	return board;
	
}
}

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("Welcome");
		CreateBoard obj1 = new CreateBoard();
		obj1.createBoard();
	}

}
