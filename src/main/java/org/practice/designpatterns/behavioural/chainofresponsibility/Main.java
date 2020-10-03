package org.practice.designpatterns.behavioural.chainofresponsibility;

import static org.practice.designpatterns.behavioural.chainofresponsibility.ErrorLevel.DEBUG;
import static org.practice.designpatterns.behavioural.chainofresponsibility.ErrorLevel.ERROR;
import static org.practice.designpatterns.behavioural.chainofresponsibility.ErrorLevel.INFO;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class Main {
	public static void main(String[] args) {
		ErrorLogger logger = new ConsoleErrorLogger();
		ErrorMessage infoMessage = new ErrorMessage("This is info level message", INFO);
		ErrorMessage debugMessage = new ErrorMessage("This is debug level message", DEBUG);
		ErrorMessage errorMessage = new ErrorMessage("This is error level message", ERROR);
		
		logger.handle(infoMessage);
		System.out.println();
		
		logger.handle(debugMessage);
		System.out.println();
		
		logger.handle(errorMessage);
		System.out.println();
	}
}
