package org.practice.designpatterns.structural.adaptor;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-27
 */
public class AdvancedMediaPlayerAdaptor implements MediaPlayer {
	
	AdvancedMediaPlayer advMediaPlayer;

	public AdvancedMediaPlayerAdaptor(AdvancedMediaPlayer advMediaPlayer) {
		this.advMediaPlayer = advMediaPlayer;
	}

	@Override
	public void play(String audioType, String fileName) {
		if(fileName.endsWith("mp3")) {
			System.out.println("playing " + fileName);
		} else {
			advMediaPlayer.loadFile(fileName);
			advMediaPlayer.listen();
		}
	}
	
}
