//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.setSpeed(20);

		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
		int numberOfSpins = JOptionPane.showOptionDialog(null, "How dizzy do you want to make the robot?", "ALERT", JOptionPane.CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, new String[] {"1","2","3","4","5","6","7","8","9","10"}, "Me");
 // 1. Use the dance method to make the robot spin.
		dance(numberOfSpins + 1);
	}	

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			rob.turn(360);
		}
	}
}

