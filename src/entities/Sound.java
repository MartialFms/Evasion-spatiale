package entities;

import java.io.File;

public class Sound {
	//Attributes
	
	private int id;
	private String path;
	private File file;

	//Constructor
	
	public Sound(int id, String path, File file) {
		this.setId(id);
		this.setPath(path);
		this.setFile(file);

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
	
}
