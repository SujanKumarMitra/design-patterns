package org.practice.designpatterns.designprinciples.delegationprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class PrinterService {

	private Printer printer;

	public PrinterService(Printer printer) {
		this.printer = printer;
	}

	public void print(String page) {
		printer.print(page);
	}
}
