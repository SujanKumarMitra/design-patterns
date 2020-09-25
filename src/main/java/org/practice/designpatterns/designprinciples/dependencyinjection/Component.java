package org.practice.designpatterns.designprinciples.dependencyinjection;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Component {
	private LoggerService loggerService;

	public Component(LoggerService loggerService) {
		this.loggerService = loggerService;
	}

	public void setLoggerService(LoggerService loggerService) {
		this.loggerService = loggerService;
	}
	
	
	public void compute() {
		loggerService.log("doing stuff");
	}
}
