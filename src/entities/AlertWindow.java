package entities;

import java.awt.FlowLayout;
import java.io.File;
import java.util.Random;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AlertWindow {

	// Attributes
	Random r = new Random();
	private JFrame frame;
	private JButton button;
	private JPanel panel;
	private File picture;
	private File sound;

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
		});

	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		
		this.panel = panel;
	}

	public File getPicture() {
		return picture;
	}

	public void setPicture(File picture) {
		this.picture = picture;
	}

	public void displayAlertWindow() {
		this.getFrame().setVisible(true);
		}

	public File getSound() {
		return sound;
	}

	public void setSound(File sound) {
		this.sound = sound;
	}
}

//		Random r = new Random();
//		int x = r.nextInt();
//		int y = r.nextInt();
//		JFrame frame = new JFrame("Back to work !");
//		JPanel panel = new JPanel();
//		panel.setLayout(new FlowLayout());
//		
//
//		JButton button = new JButton();
//		button.setText("OK !");
//		button.addActionListener(e -> {
//			frame.dispose();
//		});
//
//		panel.add(button);
//		frame.add(panel);
//		frame.setSize(300, 400);
//		frame.setAlwaysOnTop(true);
//		frame.setLocationRelativeTo(null);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
//	}

//}