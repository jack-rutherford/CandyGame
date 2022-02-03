package jrutherford_lvanHout_project3;

import java.util.Random;
import java.util.Scanner;

public class Controller {
	private CandyGame cg;
	private int lowerBoundCandy;
	private int upperBoundCandy;
	private int studentNumber;
	private static final int LOWER_STUDENT_LIMIT = 15, UPPER_STUDENT_LIMIT = 30;
	private static final int LOWER_LOWER_BOUND = 4, LOWER_UPPER_BOUND = 10;
	private int upperLowerBound;
	private int upperUpperBound;
	private Scanner scan;

	/**
	 * Creates a new controller object with default settings
	 */
	public Controller() {
		cg = new CandyGame();
		studentNumber = 15;
		scan = new Scanner(System.in);

	}

	/**
	 * Runs the game itself, takes input from user and uses methods from CandyGame
	 */
	public void runGame() {
		
		// Gets the number of students in the game
		int numOfStudents = cg.setNumberOfPlayers(LOWER_STUDENT_LIMIT, UPPER_STUDENT_LIMIT);
		
		// Sets the lower bound for amount of candy a student can get
		System.out.println("Setting the lower bound of candy:");
		int lowNumOfCandy = cg.setBound(LOWER_LOWER_BOUND, LOWER_UPPER_BOUND);
		
		// Sets limit for smallest size of the upper bound
		upperLowerBound = lowNumOfCandy + 2;
		
		// Sets limit for largest size of the upper bound
		upperUpperBound = lowNumOfCandy + 50;
		
		// Sets the upper bound for amount of candy a student can get
		System.out.println("Setting the upper bound of candy:");
		int highNumOfCandy = cg.setBound(upperLowerBound, upperUpperBound);
		
		// Distribute the candy to the students
		cg.distributeCandy(lowNumOfCandy, highNumOfCandy);
		
		// Have user decide if they want the array printed every time
		System.out.println("Would you like the array to be printed every time candy is redistributed? (yes or no)");
		boolean print;
		boolean finished = false;
		while(!finished) {
			String answer = scan.next().toLowerCase();
			if(!answer.contains("no") || !answer.contains("yes")) {
				System.out.println("Would you like the array to be printed every time candy is redistributed? (yes or no)");
				
			}
		}
		
		boolean isGameDone = cg.isGameDone();
		while(!isGameDone) {
			
		}
		
		
		
		// Test current stuff in program
		System.out.println(numOfStudents + " " + lowNumOfCandy + " " + highNumOfCandy);

		
	}


	public static void main(String[] args) {
		new Controller().runGame();
		
	}

}
