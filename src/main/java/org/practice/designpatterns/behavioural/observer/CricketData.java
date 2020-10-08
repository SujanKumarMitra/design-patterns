package org.practice.designpatterns.behavioural.observer;

import java.util.function.Supplier;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public class CricketData extends AbstractSubject {

	private int runs;
	private int wickets;
	private double overs;

	public CricketData() {
	}

	public CricketData(int runs, int wickets, double overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
	}


	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public double getOvers() {
		return overs;
	}

	public void setOvers(double overs) {
		this.overs = overs;
	}
	
	public void setData(int runs,int wickets, double overs) {
		setRuns(runs);
		setWickets(wickets);
		setOvers(overs);
		super.notifyObservers();
	}

	@Override
	@SuppressWarnings("unchecked")
	public Supplier<CricketData> getState() {
		return () -> this;
	}

}
