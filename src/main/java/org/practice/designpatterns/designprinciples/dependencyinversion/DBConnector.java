package org.practice.designpatterns.designprinciples.dependencyinversion;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class DBConnector {
	private DBConnection connection;

	public DBConnector(DBConnection connection) {
		this.connection = connection;
	}
	
	public void connectToDB() {
		if(connection.connect() == 1) {
			System.out.println("connection successful");
		} else {
			System.out.println("connection not successful");			
		}
	}
}
