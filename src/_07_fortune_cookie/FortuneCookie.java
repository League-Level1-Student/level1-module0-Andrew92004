package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton button = new JButton();
	
	public void showButton() {
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane woohoo = new JOptionPane();
		int rand = new Random().nextInt(5);
		if (rand == 3) {
		woohoo.setMessage("Woohoo");
		woohoo.
	}
		frame.pack();
}
}