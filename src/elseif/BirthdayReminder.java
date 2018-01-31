
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 14th";
		String dadsBirthday = "October 8th";
		String myBirthday = "June 10th";

		// 2. Find out which birthday the user wants and and store their response in a variable
int answer = JOptionPane.showOptionDialog(null, "Who's birthday do you want?", "birthday", JOptionPane.CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, new String[] {"Mom", "Dad", "Me"}, "Me");
		// 3. Print out what the user typed
System.out.println(answer);
		// 4. if user asked for "mom"
if(answer == 0) {
	JOptionPane.showMessageDialog(null, momsBirthday);
}
if(answer == 1) {
	JOptionPane.showMessageDialog(null, dadsBirthday);
}
if(answer == 2) {
	JOptionPane.showMessageDialog(null, myBirthday);
}


	} 
}
