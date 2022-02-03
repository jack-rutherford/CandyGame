package jrutherford_lvanHout_project3;

import java.util.Random;
import java.util.Scanner;

public class CandyGame {

	private Scanner sc;
	private Random rand;
	private int[] students;

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
		System.out.println("This is working properly (distributeCandy())");
		//use random num generator and make it even

	}

	private void printIntArray() {
		int[] temp = new int[0];
		//use demo method %4 printf line to print array
	}

	private void passCandy() {
		System.out.println("This is working properly (passCandy())");
	}

	private boolean isGameDone() {
		return false;
		//iterate through array, if all values are equal return true
	}
	
	public void runGame() {
		//Luke will work on this
	}
	
}
