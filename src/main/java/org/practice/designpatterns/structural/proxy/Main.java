package org.practice.designpatterns.structural.proxy;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-02
 */
public class Main {
	public static void main(String[] args) {
		String fileName = "pic.jpg";
		ImageViewer imageViewer = new RealImageViewer(fileName);
		imageViewer.display();

		imageViewer = new ProxyImageViewer(fileName);
		imageViewer.display();
	}
}
