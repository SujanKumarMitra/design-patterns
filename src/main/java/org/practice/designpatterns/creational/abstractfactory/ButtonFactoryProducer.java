package org.practice.designpatterns.creational.abstractfactory;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class ButtonFactoryProducer {

	public static AbstractButtonFactory getButtonFactory() {
		String os = System.getProperty("os.name").toLowerCase();

		if (os.contains("win")) {
			return new WinButtonFactory();
		} else if (os.contains("mac")) {
			return new MacButtonFactory();
		} else if (os.contains("nux") || os.contains("nix")) {
			return new LinuxButtonFactory();
		} else {
			throw new UnsupportedOperationException("button factory not implemented for " + os);
		}
	}
}
