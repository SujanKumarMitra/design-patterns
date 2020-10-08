package org.practice.designpatterns.behavioural.observer;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public class AverageScore extends Observer {

	public AverageScore(CricketData data) {
		super(data);
	}

	@Override
	protected void update() {
		CricketData data = (CricketData) super.subject.getState().get();
		double runRate = (double) data.getRuns() / data.getOvers();
		System.out.printf("Current Run Rate: %.2f, ", runRate);
		int predictedScore = (int) (runRate * 50);
		System.out.println("Predicted Score: " + predictedScore);
	}

}
