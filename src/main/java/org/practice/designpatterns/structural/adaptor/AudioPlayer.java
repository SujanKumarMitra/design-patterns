package org.practice.designpatterns.structural.adaptor;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-27
 */
public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equals("mp3") && fileName.endsWith("mp3")) {
			System.out.println("playing " + fileName);
		} else {
			System.out.println("Unable to play " + audioType + " file");
		}
	}

}
