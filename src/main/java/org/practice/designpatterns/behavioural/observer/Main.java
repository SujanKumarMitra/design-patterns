package org.practice.designpatterns.behavioural.observer;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		CricketData subject = new CricketData();

		CurrentScore currObserver = new CurrentScore(subject);
		AverageScore avgObserver = new AverageScore(subject);

		subject.setData(90, 2, 10.2);

		currObserver.removeSubject();

		subject.setData(90, 2, 10.2);
	}
}
