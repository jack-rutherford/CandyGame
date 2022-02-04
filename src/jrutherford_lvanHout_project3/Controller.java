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
public class Controller {
	

	/**
	 * Creates a new controller object with default settings
	 */
	public Controller() {
		
	}

	/**
	 * Runs the game itself, takes input from user and uses methods from CandyGame
	 */
	public static void main(String[] args) {
		CandyGame cg = new CandyGame();
		cg.runGame();
	}

}
