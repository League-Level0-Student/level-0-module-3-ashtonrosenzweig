//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		int like = JOptionPane.showConfirmDialog(null, "Do you like bananas?");
		//2. if they say no, 
		if(like == 1) {
			//tell them they are crazy 
		JOptionPane.showMessageDialog(null, "You are bananas!");}
			//and end quiz
		//3. if they say yes
		if(like == 0) {
		//	ask them what is their favorite hobby
		String hobby = JOptionPane.showInputDialog("What is your favorite hobby?");
		//	show a pop up that says "<your hobby> is much better with bananas!"
		JOptionPane.showMessageDialog(null, hobby + " are much better with bananas!");
		//4. OPTIONAL: if they say something other than â€œyesâ€� or â€œnoâ€�
		//	show a pop up that says â€œYou are bananas!â€�
	
	}

}}
