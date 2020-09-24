package org.practice.designpatterns.designprinciples.delegationprinciple;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-24
 */
public class Main {
	public static void main(String[] args) {
		PrinterService printerService = new PrinterService(new Printer());
		printerService.print("Page1");
		printerService.print("Page2");
		printerService.print("Page3");
	}
}
