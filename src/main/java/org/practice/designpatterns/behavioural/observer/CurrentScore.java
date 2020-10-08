package org.practice.designpatterns.behavioural.observer;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public class CurrentScore extends Observer {

	public CurrentScore(CricketData data) {
		super(data);
	}

	@Override
	protected void update() {
		CricketData data = (CricketData) super.subject.getState().get();
		StringBuilder sb = new  StringBuilder();
		
		sb.append('[');
		sb.append("Runs=").append(data.getRuns()).append(", ");
		sb.append("Overs=").append(data.getOvers()).append(", ");
		sb.append("Wickets=").append(data.getWickets());
		sb.append(']');
		
		System.out.println(sb);
	}
	
}
