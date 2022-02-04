package jrutherford_lvanHout_project3;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author jackrutherford
 * @author lukevanhout
 * @date 2/3/22
 * @class CSCI 235
 *
 */
public class CandyGame {

	private Scanner sc;
	private Random rand;
	private int[] students;
	private static final int LOWER_STUDENT_LIMIT = 15, UPPER_STUDENT_LIMIT = 30;
	private static final int LOWER_LOWER_BOUND = 4, LOWER_UPPER_BOUND = 10;
	private int upperLowerBound;
	private int upperUpperBound;
	private boolean flag;

	public CandyGame() {
		sc = new Scanner(System.in);
		rand = new Random();
		flag = false;
	}

	/**
	 * 
	 * 
	 * 
	 * @param min
	 * @param max
	 * @return num
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
	
	/**
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
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
	
	/**
	 * Uses the Random class to distribute candy within the bounds (parameters)
	 * and makes sure that the random number is an even number
	 * @param min
	 * @param max
	 */
	private void distributeCandy(int min, int max) {
		for(int i = 0; i < students.length; i++) { 
			rand = new Random();
			int num = 0;
			boolean result = false;
			while(!result) { //checks to make sure it generates a random even number
				num = rand.nextInt(max-min) + min;
				if(num % 2 == 0) { //if it's even, result = true ending the while loop
					result = true;
				}
			}
			students[i] = num;
		}
	}

	/**
	 * Print the array of students with a field width of size 4 between numbers
	 */
	private void printIntArray() { 
		for(int i = 0; i < students.length-1; i++) {
			System.out.printf("%4d", students[i]);
		}
	}

	/**
	 * First for loop: Make temp array = to student array with everything  
	 * shifted up 1 index (to the right) and divided by 2, and then divide 
	 * the students array value at index by 2 as well 
	 * 
	 * Second for loop: Add the temp array and student array together and 
	 * make all value even numbers
	 * 
	 * Then check if you want to print the array each time, and do a check with
	 * the isGameDone() method to check if all values in students are equal to each other
	 * 
	 */
	private void passCandy() { 

		int[] temp = new int[students.length];
		for(int i = 0; i < students.length; i++) {
			if(i == students.length-1) { 
				temp[0] = students[i] / 2; //first temp value = the last student value / 2
			}
			else {
				temp[i+1] = students[i] / 2; //temp value to the right = student value at i / 2
			}
			students[i] = students[i] / 2; //divide the student array index by 2
		}

		// Adds the temp array to the student array, and makes it even
		for(int j = 0; j < students.length; j++) {
			students[j] += temp[j];
			if(students[j] % 2 == 1) {
				students[j]++;
			}
		}
		
		//if flag == true, print the array each time passCandy() is called
		if(flag) {
			printIntArray();
			System.out.println();
			
		}
		
		//if everything in the array isn't equal, run passCandy() again
		if(!isGameDone()) {
			passCandy();
		}

	}

	private boolean isGameDone() {
		//iterate through array, if all values are equal return true
		// check if everything in the array is equal, if not use recursion
		// to run the method again to make them equal :)
		int first = students[0];
		for(int k = 1; k < students.length; k++) {
			if(students[k] !=  first) {
				return false;
			}
		}
		return true;
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
		System.out.println();

		// Have user decide if they want the array printed every time
		System.out.println("Would you like the array to be printed every time candy is redistributed? (yes or no)");
		boolean finished = false;
		while(!finished) {
			String answer = sc.next().toLowerCase();
			if(!answer.contains("no") || !answer.contains("yes")) {
				System.out.println("Would you like the array to be printed every time candy is redistributed? (yes or no)");
			}
			if(answer.contains("no")) {
				finished = true;
				flag = false; //false = don't print each time passCandy() is called
			}
			if(answer.contains("yes")) {
				finished = true;
				flag = true; //true = print each time passCandy() is called
			}
		}

		//Distributes the candy among the students
		passCandy();
	}	
}
