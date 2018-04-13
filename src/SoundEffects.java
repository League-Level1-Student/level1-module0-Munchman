import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener{
	static SoundEffects se = new SoundEffects();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	public static void main(String[] args) {
		
		se.getGoing();
	}
	
	
	
	
	private void getGoing() {
		// TODO Auto-generated method stub
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		panel.add(button);
		panel.add(button1);
		button.setText("sawing wood");
		button1.setText("fart");
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.pack();
	}
	
   void sawingWood() {
	   
   }




	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
	
	private void playFart(String fileName) {
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		
if (buttonPressed==button ) {
	se.playSound("sawing-wood-daniel_simon.wav");
		}
if (buttonPressed==button1 ) {
	se.playSound("fart.wav");
		}
	}
	

}
