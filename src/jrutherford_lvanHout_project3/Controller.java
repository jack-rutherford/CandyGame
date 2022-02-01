package jrutherford_lvanHout_project3;

import java.util.Random;

public class Controller {
	private CandyGame cg;
	private int lowerBoundCandy;
	private int upperBoundCandy;
	private int studentNumber;
	private int[] students;
	private static final int LOWER_STUDENT_LIMIT = 15, UPPER_STUDENT_LIMIT = 30;

	/**
	 * Creates a new controller object with default settings
	 */
	public Controller() {
		cg = new CandyGame();
		studentNumber = 15;


	}

	/**
	 * Runs the game itself, takes input from user and uses methods from CandyGame
	 */
	public void runGame() {
		
		//studentNumber = cg.getNumberOfPlayers(LOWER_STUDENT_LIMIT, UPPER_STUDENT_LIMIT);

		//Creates an array that contains the correct number of students
		

		//Sets bounds for amount of candy distributed
		//Step 3

		//Step 4


	}


	public static void main(String[] args) {
		new Controller().runGame();
	}

}
