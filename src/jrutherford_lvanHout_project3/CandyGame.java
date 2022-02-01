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

	public int getNumberOfPlayers(int min, int max) {
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
