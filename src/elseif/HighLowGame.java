//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		int tryagain = 0;
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(101 + 1);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		while (tryagain == 0) {

			// 1. ask the user for a guess using a pop-up window, and save their response
			String guess = JOptionPane
					.showInputDialog("I am thinking of a number 1-100, what number am I thinking of?");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int guessn = Integer.parseInt(guess);
			// 5. if the guess is correct
			if (guessn == random) {
			tryagain = JOptionPane.showConfirmDialog(null, "You win! Play again?");
			}
			// 6. win
			// 7. if the guess is high
			if (guessn > random) {
				tryagain = JOptionPane.showConfirmDialog(null, "Your guess is too high! Try again?");

			}
			// 8. tell them it's too high
			// 9. if the guess is low
			// 10. tell them it's too low
			if (guessn < random) {
				tryagain = JOptionPane.showConfirmDialog(null, "Your guess is too low! Try again?");
				// 12. tell them they lose

			}

		}
	}
}
