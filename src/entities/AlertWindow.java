package entities;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlertWindow {

	// Attributes
	Random r = new Random();
	private JFrame frame;
	private JButton button;
	private JPanel panel;
	private Images picture;
	private Sound sound;

	// Constructor

	public AlertWindow() {
		this.setButton(new JButton());
		this.setPanel(new JPanel());
		this.setFrame(new JFrame("Go back to work !"));	
		this.getPanel().setLayout(new FlowLayout());
		this.getPanel().add(this.getButton());
		this.getFrame().add(this.getPanel());
		this.getFrame().setSize(300, 400);
		this.frame.setLocation(r.nextInt(1200), r.nextInt(500));
		this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	// Methods
	
	public JFrame getFrame() {	
		return frame;
	}

	public void setFrame(JFrame frame) {
	
		this.frame = frame;
		
		
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
		this.getButton().setText("OK !");
		this.getButton().addActionListener(e -> {
	    frame.dispose();
	    Sound.stopSound();
		});

	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		
		this.panel = panel;
	}

	public Images getPicture() {
		return picture;
	}

	public void setPicture(Images picture) {
		this.picture = picture;
	}

	public void displayAlertWindow() {
		this.setPicture(new Images(1,"assets/go.gif"));
		ImageIcon icon = new ImageIcon();
		JLabel label = new JLabel(icon);
		this.getPanel().setLayout(new FlowLayout());
		label.setIcon(new ImageIcon(this.getPicture().getPath()));
		this.getPanel().add(label);
		this.getFrame().setVisible(true);
		Sound.playSound();
		}

	public Sound getSound() {
		return sound;
	}

	public void setSound(Sound sound) {
		this.sound = sound;
	}
}