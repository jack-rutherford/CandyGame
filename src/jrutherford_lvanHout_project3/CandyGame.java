package jrutherford_lvanHout_project3;

import java.util.Random;
import java.util.Scanner;

public class CandyGame {

	private Random rand;
	
	public CandyGame() {
		
	}

	public int getNumberOfPlayers(int min, int max, int input) {
		boolean result = false;
		int num = 0;
		while(!result) {
			System.out.println("Please enter a number between " + min + " and " + max + " inclusive");
			if(input < min || input > max) {
				System.out.println("That number was not between " + min + " and " + max + 
						". Please re-enter");
			}
			else {
				num = input;
				result = true;
			}
		}
		return num;
	}

	public int getEvenIntInRange(int lower, int upper) {
		return 0;
	}

	public void distributeCandy(int lower, int upper) {
		System.out.println("This is working properly (distributeCandy())");
		
		
	}

	public int[] printIntArray() {
		int[] temp = new int[0];
		return temp;
	}

	public void passCandy() {
		System.out.println("This is working properly (passCandy())");
	}

	public boolean isGameDone() {
		return false;
	}

}
