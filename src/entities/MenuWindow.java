package entities;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;

public class MenuWindow {
	
	//Attributes
	private JFrame frame;
	private JButton buttonStart;
	private JButton buttonClose;
	private JPanel panel;
	private Timer timer;
	
	//Constructors
	
	public MenuWindow() {
		this.setButtonClose(new JButton());
		this.setButtonStart(new JButton());
		this.setPanel(new JPanel());
		this.setFrame(new JFrame("Attention check"));
		this.setTimer(new Timer());
		
		this.getPanel().setLayout(new FlowLayout());
		this.getPanel().add(this.getButtonStart());
		this.getPanel().add(this.getButtonClose());
		this.getFrame().add(this.getPanel());
		this.getFrame().setSize(300, 400);
		this.getFrame().setLocationRelativeTo(null);
		this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	//Methods
	
	public Timer getTimer() {
		return timer;
	}
	
	public void setTimer(Timer timer) {
		this.timer = timer;
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getButtonStart() {
		return buttonStart;
	}

	public void setButtonStart(JButton buttonStart) {
		this.buttonStart = buttonStart;
		this.getButtonStart().setText("Start");
		this.getButtonStart().addActionListener(e->{this.startAlert();});
	}

	public JButton getButtonClose() {
		return buttonClose;
	}

	public void setButtonClose(JButton buttonClose) {
		
		this.buttonClose = buttonClose;
		this.getButtonClose().setText("Close");
		this.getButtonClose().addActionListener(e->{System.exit(0);});
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void displayWindow() {
	this.getFrame().setVisible(true);
	}
	
	public void startAlert() {
		
		new TaskAlert().run();
	}
	
}
