package org.practice.designpatterns.structural.proxy;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-02
 */
public class ProxyImageViewer implements ImageViewer {
	String fileName;
	ImageViewer imageViewer;

	public ProxyImageViewer(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (imageViewer == null) {
			imageViewer = new RealImageViewer(fileName);
		}
		imageViewer.display();
	}
}
