package org.practice.designpatterns.structural.proxy;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-02
 */
public class RealImageViewer implements ImageViewer{
	String fileName;

	public RealImageViewer(String fileName) {
		this.fileName = fileName;
		loadFromDisk();
	}
	
	public void loadFromDisk() {
		System.out.println("Loading " + fileName + " from disk ");
	}
	
	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}
	
}
