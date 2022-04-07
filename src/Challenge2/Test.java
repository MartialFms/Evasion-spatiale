package Challenge2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Back to work !");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JButton button = new JButton();
		button.setText("OK !");

		panel.add(button);
		frame.add(panel);
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
