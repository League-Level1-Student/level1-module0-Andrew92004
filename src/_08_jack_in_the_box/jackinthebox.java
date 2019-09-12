package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jackinthebox implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton suprise = new JButton();
	int clicks = 0;
	String fileName = ("jackInTheBox.png");
	public void showButton() {
		frame.setVisible(true);
		frame.add(suprise);
		frame.pack();
		suprise.addActionListener(this);
		frame.setSize(300, 300);


	}

	private void showPicture(String fileName) { 
	      try {
	           JLabel imageLabel = createLabelImage("jackInTheBox.png");
	           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	           frame.add(imageLabel);
	           frame.setVisible(true);
		   		frame.pack();	
	           imageLabel.setSize(500,500);
	           
	      } catch (Exception e) {
	           e.printStackTrace();
	      }
	 }


	private JLabel createLabelImage(String fileName) {
	     try {
		          java.net.URL imageURL = getClass().getResource("jackInTheBox.png");
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	           } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	      } catch (Exception e) {
	           System.err.println("Could not find image " + fileName);
	           return new JLabel();
	           
	     }
	 }
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource("homer-woohoo.wav"));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		clicks ++;
		if (clicks == 5) {
			System.out.println(clicks);
			suprise.setVisible(false);
			showPicture("jackInTheBox.png");
			playSound("homer-woohoo.wav");
			clicks = 0;
		}
	}

}
