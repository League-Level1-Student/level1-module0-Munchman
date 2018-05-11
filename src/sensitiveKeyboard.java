import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class sensitiveKeyboard implements KeyListener {
	JFrame frame= new JFrame();
	JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		new sensitiveKeyboard().buildGUI();
	}
	void buildGUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.addKeyListener(this);
	}
	static void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	          }
	     }
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		speak("ouch");
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	} 

