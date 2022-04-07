package entities;

import java.io.File;
import jaco.mp3.player.MP3Player;

public class Sound {
	
	private static MP3Player mp3Player;

	public static void playSound() {
		File f = new File("src/assets/music.mp3");
		setMp3Player(new MP3Player(f));
		getMp3Player().play();
	}
	
	public static void loopSound() {
		while (!getMp3Player().isStopped()) {
			Sound.playSound();
		}
	}
	
	public static void stopSound() {
		getMp3Player().isStopped();
	}
	
	public static MP3Player getMp3Player() {
		return mp3Player;
	}

	public static void setMp3Player(MP3Player mp3Player) {
		Sound.mp3Player = mp3Player;
	}

}
