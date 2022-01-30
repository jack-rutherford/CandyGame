package jrutherford_lvanHout_project3;

import java.util.Scanner;
import java.util.Random;

public class Controller {
	private CandyGame cg;
	private int lowerBoundCandy;
	private int upperBoundCandy;
	private int studentNumber;
	private Scanner scan;
	private int[] students;
	private static final int LOWER_STUDENT_LIMIT = 15, UPPER_STUDENT_LIMIT = 30;
	
	/**
	 * Creates a new controller object with default settings
	 */
	public Controller() {
		cg = new CandyGame();
		lowerBoundCandy = 4;
		upperBoundCandy = 54;
		studentNumber = 15;
		scan = new Scanner(System.in);
		
		
	}
	
	/**
	 * Runs the game itself, takes input from user and uses methods from CandyGame
	 */
	public void runGame() {
		//Sets the number of students that will be playing the game
		studentNumber = cg.getNumberOfPlayers(LOWER_STUDENT_LIMIT, UPPER_STUDENT_LIMIT);
		
		students = new int[studentNumber];
		
		
		
	}

	
	public static void main(String[] args) {
		new Controller().runGame();
	}

}
