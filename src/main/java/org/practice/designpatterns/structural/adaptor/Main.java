package org.practice.designpatterns.structural.adaptor;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-27
 */
public class Main {
	public static void main(String[] args) {
		AdvancedMediaPlayer mp4Player = new Mp4Player();
		AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
		
		String mp3File = "music.mp3";
		String mp4File = "video.mp3";
		String vlcFile = "vlc-file.vlc";
		String aviFile = "avi-file.avi";
		
		MediaPlayer mediaPlayer = new AdvancedMediaPlayerAdaptor(mp4Player);
		
		mediaPlayer.play("mp3", mp3File);
		mediaPlayer.play("mp4", mp4File);
		mediaPlayer.play("vlc", vlcFile);
		mediaPlayer.play("avi", aviFile);
		
		mediaPlayer = new AdvancedMediaPlayerAdaptor(vlcPlayer);
		mediaPlayer.play("vlc", vlcFile);
		mediaPlayer.play("avi", aviFile);
		
		
	}
}
