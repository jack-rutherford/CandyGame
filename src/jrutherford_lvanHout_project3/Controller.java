package jrutherford_lvanHout_project3;

/**
 * This is the class that instantiates and runs the CandyGame class
 * 
 * @author lukevanhout
 * @author jackrutherford
 * @date 2/4/22
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
