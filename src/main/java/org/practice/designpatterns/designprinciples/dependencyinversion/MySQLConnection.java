package org.practice.designpatterns.designprinciples.dependencyinversion;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class MySQLConnection implements DBConnection {

	@Override
	public int connect() {
		return 1;
	}
	
}
