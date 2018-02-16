/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String penguin="http://b3ta.com/images/challenge/fluffy_biggy.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component photo;
		// 3. use the "createImage()" method below to initialize your Component
photo=createImage(penguin);
		// 4. add the image to the quiz window
quizWindow.add(photo);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String p = JOptionPane.showInputDialog("what is cute and black and whight?");
		// 7. print "CORRECT" if the user gave the right answer
if(p.equals("penguin")){
	JOptionPane.showMessageDialog(null, "Correct!");
	
}
else{
	JOptionPane.showMessageDialog(null, "Wrong!");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(photo);
		// 10. find another image and create it (might take more than one line of code)
String me="http://photos-images.active.com/file/1/5223722/optimized/f46f2c5d-1d7b-46c3-a49f-703a9ec987f8.jpg?v=1000";
		// 11. add the second image to the quiz window
photo=createImage(me);
quizWindow.add(photo);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String potato = JOptionPane.showInputDialog("who dis awesome person?");
		// 14+ check answer, say if correct or incorrect, etc.
if(potato.equals("marc")) {
	JOptionPane.showMessageDialog(null, "YEEEEEEET");
}
else {
	JOptionPane.showMessageDialog(null, "NOPEEEEE");
}
quizWindow.dispose();

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





