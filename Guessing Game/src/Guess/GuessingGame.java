package Guess;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int randInt = rand.nextInt(16);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guess a number between 0 and 15: ");
		
		int i = 0;
		
		System.out.println(randInt);
		
		while(i < 3) {
			int numberGuessed = scan.nextInt();
			if(numberGuessed == randInt) {
				System.out.println("Congrats! You guessed the number!");
				break;
			}
			System.out.println("That doesn't seem to be right, try again!");
			i++;
		}
		scan.close();
	}
}