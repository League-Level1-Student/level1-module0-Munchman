import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
new FortuneCookie().showButton();
}
void showButton() {
	System.out.println("Button");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton button = new JButton();
	frame.add(button);
	button.addActionListener(this);
	button.setText("hello");
	frame.pack();
	
	
	
}
int rand = new Random().nextInt(5);
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo");
	if (rand==0) {
		JOptionPane.showMessageDialog(null, "you will be adopted by aliens");
	}
	else if (rand==1) {
		JOptionPane.showMessageDialog(null, "you will find $20 on the street");
	}
	else if (rand==2) {
		JOptionPane.showMessageDialog(null, "you will step on dog poop soon");
	}
	else if (rand==3) {
		JOptionPane.showMessageDialog(null, "you will get a high score on a video game");
	}
	else {
		JOptionPane.showMessageDialog(null, "Marc is awesome!!!!!");
	}
}
}