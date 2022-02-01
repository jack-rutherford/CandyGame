package jrutherford_lvanHout_project3;

import java.util.Random;

public class Controller {
	private CandyGame cg;
	private int lowerBoundCandy;
	private int upperBoundCandy;
	private int studentNumber;
	private static final int LOWER_STUDENT_LIMIT = 15, UPPER_STUDENT_LIMIT = 30;
	private static final int LOWER_LOWER_BOUND = 4, LOWER_UPPER_BOUND = 10;
	private int upperLowerBound;
	private int upperUpperBound;

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
		
		// Gets the number of students in the game
		int numOfStudents = cg.setNumberOfPlayers(LOWER_STUDENT_LIMIT, UPPER_STUDENT_LIMIT);
		
		// Sets the lower bound for amount of candy a student can get
		int lowNumOfCandy = cg.setBound(LOWER_LOWER_BOUND, LOWER_UPPER_BOUND);
		
		// Sets limit for smallest size of the upper bound
		if(lowNumOfCandy % 2 == 1) {
			upperLowerBound = lowNumOfCandy + 1;
		}
		else {
			upperLowerBound = lowNumOfCandy + 2;
		}
		
		// Sets limit for largest size of the upper bound
		upperUpperBound = lowNumOfCandy + 50;
		
		// Sets the upper bound for amount of candy a student can get
		int highNumOfCandy = cg.getBound();
		
		
		
	}


	public static void main(String[] args) {
		new Controller().runGame();
	}

}
