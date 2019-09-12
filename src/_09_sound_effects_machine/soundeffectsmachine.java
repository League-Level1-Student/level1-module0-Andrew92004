package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundeffectsmachine implements ActionListener {
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton wood = new JButton();
	JButton hammer = new JButton();
	
	
	public void showButton() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wood.setSize(250,250);
		hammer.setSize(250,250);
		frame.setVisible(true);
		panel.setVisible(true);
		panel.add(wood);
		panel.add(hammer);
		frame.add(panel);
		frame.pack();
		wood.addActionListener(this);
		hammer.addActionListener(this);
	}
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == wood) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		if (buttonClicked == hammer) {
			playSound("hammering.wav");
		}
	}

}
