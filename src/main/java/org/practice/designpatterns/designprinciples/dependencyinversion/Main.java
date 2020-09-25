package org.practice.designpatterns.designprinciples.dependencyinversion;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class Main {

	public static void main(String[] args) {
		DBConnector connector = new DBConnector(new MySQLConnection());
		connector.connectToDB();
	}

}
