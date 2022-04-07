package entities;

import java.io.File;

public class Image {
	//Attributes
	
	private int id;
	private File file;

	//Constructor
	
	public Image(int id, File file) {
		this.setFile(file);
		this.setId(id);
	}
	
	//Methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
}
