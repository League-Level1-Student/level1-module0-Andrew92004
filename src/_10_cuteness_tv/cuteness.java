package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness implements ActionListener {
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton duck = new JButton();
	JButton frog = new JButton();
	JButton unicorn = new JButton();
	
	public void showButton() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		panel.setVisible(true);
		panel.add(duck);
		panel.add(frog);
		panel.add(unicorn);
		frame.add(panel);
		frame.pack();
		duck.addActionListener(this);
		frog.addActionListener(this);
		unicorn.addActionListener(this);
		duck.setText("Ducks");
		frog.setText("Frogs");
		unicorn.setText("Unicorn");
		frame.pack();
		}
	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}
	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == duck) {
			showDucks();
		}
		if (buttonClicked == frog) {
			showFrog();
		}
		if (buttonClicked == unicorn) {
			showFluffyUnicorns();
		}
	}

}
