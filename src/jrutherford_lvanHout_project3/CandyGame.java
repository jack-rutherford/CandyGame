package jrutherford_lvanHout_project3;

import java.util.Random;
import java.util.Scanner;

public class CandyGame {

	private Random rand;

	public int getNumberOfPlayers(int min, int max) {
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(!result) {
			int userInput = sc.nextInt();
			if(userInput < min || userInput > max) {
				System.out.println("Please enter a number between " + min + " and " + max + "inclusive");
			}
			else {
				sc.close();
				num = userInput;
				result = true;
			}
		}
		return num;
	}

	public int getEvenIntInRange(int lower, int upper) {
		return 0;
	}

	public void distributeCandy(int lower, int upper) {
		System.out.println("This is wokring properly (distributeCandy())");
	}

	public int[] printIntArray() {
		int[] temp = new int[0];
		return temp;
	}

	public void passCandy() {
		System.out.println("This is wokring properly (passCandy())");
	}

	public boolean isGameDone() {
		return false;
	}

}
