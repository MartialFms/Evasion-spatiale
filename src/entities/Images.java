package entities;

import java.awt.FlowLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Images {
	//Attributes
	
	private int id;
	private String path;
	private File file;

	//Constructor
	
	public Images(int id, String path, File file) {
		this.setId(id);
		this.setPath(path);
		this.setFile(file);
	}
	
	public Images(int id, String path) {
		this.setId(id);
		this.setPath(path);
	}
	
	//Methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public void showPicture() {
//		ImageIcon icon = new ImageIcon();
//		JLabel label = new JLabel(icon);
//		JPanel panel = new JPanel();
//		panel.setLayout(new FlowLayout());
//		label.setIcon(new ImageIcon(this.getPath()));
		
	}
	
}
