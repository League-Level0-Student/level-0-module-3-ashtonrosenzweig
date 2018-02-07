
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = new Robot();
		int whilee = 0;
		while (whilee == 0) {
			rob.clear();
			Random rand = new Random();
			int random1 = rand.nextInt(300) + 1;
			int random2 = rand.nextInt(300) + 1;
			int random3 = rand.nextInt(300) + 1;
			System.out.println("Random: " + random1 + ", " + random2 + ", " + random3);
			// 3. ask the user what color they would like the robot to draw
			rob.moveTo(450, 300);
			int color = JOptionPane.showOptionDialog(null, "What color do you want?", "Pop-up Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Red", "Green", "Blue", "Orange", "Yellow", "Purple", "Random" }, null);
			// 4. use an if/else statement to set the pen color that the user requested
			if (color == 0) {
				rob.setPenColor(255, 0, 0);
			}
			if (color == 1) {
				rob.setPenColor(0, 255, 0);
			}
			if (color == 2) {
				rob.setPenColor(0, 0, 255);
			}
			if (color == 3) {
				rob.setPenColor(255, 165, 0);
			}
			if (color == 4) {
				rob.setPenColor(255, 255, 0);
			}
			if (color == 5) {
				rob.setPenColor(128, 0, 128);
			}
			if (color == 6) {
				rob.setPenColor(random1, random2, random3);
			}
			// 5. if the user doesn’t enter anything, choose a random color

			// 2. set the pen width to 10
			rob.setPenWidth(10);
			rob.penDown();
			// 1. make the robot draw a shape (this will take more than one line of code)
			rob.setSpeed(25);
			for (int i = 0; i < 3; i++) {
				rob.move(75);
				rob.turn(-90);
			}
			rob.move(75);
			rob.penUp();
			rob.move(200);
			rob.turn(-90);
			whilee = JOptionPane.showConfirmDialog(null, "Do you want to keep playing?");
			if (whilee == 1) {
				System.exit(0);
			}
		}
	}
}
