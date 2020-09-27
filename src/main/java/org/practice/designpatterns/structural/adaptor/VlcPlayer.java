package org.practice.designpatterns.structural.adaptor;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-27
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	private String fileName;

	@Override
	public void loadFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void listen() {
		if (fileName.endsWith("vlc")) {
			System.out.println("playing " + fileName);
		} else {
			System.out.println("Unable to play " + fileName);
		}
	}

}
