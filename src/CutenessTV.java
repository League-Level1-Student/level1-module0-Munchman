import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	static CutenessTV se = new CutenessTV();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton duck = new JButton();
	JButton frog = new JButton();
	JButton unicorn = new JButton();
public static void main(String[] args) {
	se.getGoing();
}
private void getGoing() {
	frame.add(panel);
	panel.add(duck);
	panel.add(frog);
	panel.add(unicorn);
	frame.setVisible(true);
	duck.setText("cute duck");
	frog.setText("cute frog");
	unicorn.setText("cute unicorn");
	duck.addActionListener(this);
	frog.addActionListener(this);
	unicorn.addActionListener(this);
	frame.pack();
}


void showDucks() {
    playVideo("Drirjl5K9Yk");
}

void showFrog() {
    playVideo("aSjCb-FfxhI");
}

void showFluffyUnicorns() {
    playVideo("qRC4Vk6kisY");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI("https://youtu.be/" + videoID + "?autoplay=1");
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed == duck) {
		showDucks();
	}if (buttonPressed == frog) {
		showFrog();
	}
	if (buttonPressed == unicorn) {
		showFluffyUnicorns();
	}
	
}

}
