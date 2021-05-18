package com.TicTacToe.java;
class CreateBoard {
	//public char board[] = new char[10];
	public char board[] = new char[10];
	void createBoard() {
	for (int i=0; i<10; i++) {
		board[i] = ' ' ;
	}
}
}

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("Welcome");
		CreateBoard obj1 = new CreateBoard();
		obj1.createBoard();
	}

}
