import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		SoundEffects se = new SoundEffects();
		se.playSound("sawing-wood-daniel_simon.wav");
		new SoundEffects().getGoing();
	}
	
	
	
	
	private void getGoing() {
		// TODO Auto-generated method stub
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}




	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}
