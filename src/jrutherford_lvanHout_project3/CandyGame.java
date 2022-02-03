package jrutherford_lvanHout_project3;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CandyGame {

	private Scanner sc;
	private Random rand;
	private int[] students;
	private int lowerBoundCandy;
	private int upperBoundCandy;
	private int studentNumber;
	private static final int LOWER_STUDENT_LIMIT = 15, UPPER_STUDENT_LIMIT = 30;
	private static final int LOWER_LOWER_BOUND = 4, LOWER_UPPER_BOUND = 10;
	private int upperLowerBound;
	private int upperUpperBound;

	public CandyGame() {
		sc = new Scanner(System.in);
		rand = new Random();
	}

	/**
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	private int setNumberOfPlayers(int min, int max) {
		System.out.println("Setting number of students:");
		System.out.println("Please enter a number between " + min + " and " + max + " inclusive");
		boolean finished = false;
		int num = 0;
		while(!finished) {
			int input = sc.nextInt();
			if(input < min || input > max) {
				System.out.println("Please enter a number between " + min + " and " + max + " inclusive");
			}
			else {
				finished = true;
				num = input;
			}
		}
		return num;
	}

	//need to add if statement that only allows even numbers
	private int setBound(int min, int max) {
		System.out.println("Please enter an even number between " + min + " and " + max + " inclusive");
		boolean finished = false;
		int num = 0;
		while(!finished) {
			int input = sc.nextInt();
			if(input < min || input > max || input % 2 == 1) {
				System.out.println("Please enter an even number between " + min + " and " + max + " inclusive");
			}
			else {
				finished = true;
				num = input;
			}
		}
		return num;
	}

	// I don't think we need this, setBound should do it
	//	public int getEvenIntInRange(int lower, int upper) {
	//		return 0;
	//	}

	private void distributeCandy(int min, int max) {
		for(int i = 0; i < students.length; i++) {  //this might need to be length-1; CHECK LATER when done
			rand = new Random();
			
			int num = 0;
			boolean result = false;
			
			while(!result) { //checks to make sure it generates a random even number
				num = rand.nextInt(max-min) + min;
				if(num % 2 == 0) { //if its even, result = true ending the while loop
					result = true;
				}
			}
			students[i] = num;
		}
	}

	private void printIntArray() {
		for(int i = 0; i < students.length; i++) {
			System.out.printf("%4", students[i] + "\n"); // something is wrong with this line of code, please look at it
		}
	}

	private void passCandy() {
		System.out.println("This is working properly (passCandy())");
	}

	private boolean isGameDone() {
		return false;
		//iterate through array, if all values are equal return true
	}

	public void runGame() {

		// Gets the number of students in the game
		int numOfStudents = setNumberOfPlayers(LOWER_STUDENT_LIMIT, UPPER_STUDENT_LIMIT);
		students = new int[numOfStudents];
		
		// Sets the lower bound for amount of candy a student can get
		System.out.println("Setting the lower bound of candy:");
		int lowNumOfCandy = setBound(LOWER_LOWER_BOUND, LOWER_UPPER_BOUND);

		// Sets limit for smallest size of the upper bound
		upperLowerBound = lowNumOfCandy + 2;

		// Sets limit for largest size of the upper bound
		upperUpperBound = lowNumOfCandy + 50;

		// Sets the upper bound for amount of candy a student can get
		System.out.println("Setting the upper bound of candy:");
		int highNumOfCandy = setBound(upperLowerBound, upperUpperBound);

		// Distribute the candy to the students
		distributeCandy(lowNumOfCandy, highNumOfCandy);

		// Print out original deal
		System.out.println("Here is the original deal:");
		printIntArray();
		
		// Have user decide if they want the array printed every time
		System.out.println("Would you like the array to be printed every time candy is redistributed? (yes or no)");
		boolean print;
		boolean finished = false;
		while(!finished) {
			String answer = sc.next().toLowerCase();
			if(!answer.contains("no") || !answer.contains("yes")) {
				System.out.println("Would you like the array to be printed every time candy is redistributed? (yes or no)");
			}
			if(answer.contains("no")) {
				print = false;
				finished = true;
			}
			if(answer.contains("yes")) {
				print = true;
				finished = true;
			}
		}
		
		
//		boolean isGameDone = isGameDone();
//		while(!isGameDone) {
//			
//		}
	}	
}
