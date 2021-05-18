package com.TicTacToe.java;
import java.util.Scanner;
class CreateBoard {
	//public char board[] = new char[10];
	public char board[] = new char[10];
	public  char[] createBoard() {
	for (int i=1; i<10; i++) {
		board[i] = ' ' ;
	}
	return board;
	
}
	char computerSymbol;
	char userchoice;
	public  char choice() {
		System.out.println("Enter x or o");
		Scanner sc = new Scanner(System.in);
		userchoice = sc.next().charAt(0); 
		if (userchoice == 'x' || userchoice =='X') {
			computerSymbol='o';
		}
		else if (userchoice == 'o' || userchoice == 'O') {
			computerSymbol = 'x';
		}
		
		return userchoice;
}
}

/*class Choice {
	System.out.println("Enter x or o");
	//public char ch1 ='x';
	//public char ch2 ='o';
	char computerSymbol;
	char userchoice;
	public char choice() {
		System.out.println("Enter x or o");
		Scanner sc = new Scanner(System.in);
		userchoice = sc.next().charAt(1); 
		if (userchoice == 'x') {
			computerSymbol='o';
		}
		else {
			computerSymbol = 'x';
		}
		
		return userchoice;
	}*/


public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("Welcome");
		//CreateBoard obj1 = new CreateBoard();
		//obj1.createBoard();
		CreateBoard obj2 = new CreateBoard();
		obj2.choice();
	}

}
