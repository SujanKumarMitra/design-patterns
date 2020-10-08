package org.practice.designpatterns.behavioural.state.fsmdemo;

import java.util.HashMap;
import java.util.Map;

import org.practice.designpatterns.behavioural.state.State;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public class StateFactory {

	private Map<StateMode, State<Character>> states;

	public enum StateMode {
		INITIAL, INTERMEDIATE, FINAL, DEAD;
	}

	private static StateFactory instance; 

	private StateFactory() {
	}
	
	
	public static StateFactory getInstance() {
		if(instance == null) {
			synchronized (StateFactory.class) {
				if(instance == null)
					instance = new StateFactory();
			}
		}
		return instance;
	}

	private void initMap() {
		if(states != null)
			return;
		states = new HashMap<>();
		states.put(StateMode.INITIAL, new InitialState());
		states.put(StateMode.INTERMEDIATE, new IntermediateState());
		states.put(StateMode.FINAL, new FinalState());
		states.put(StateMode.DEAD, new DeadState());
	}

	public State<Character> getState(StateMode mode) {
		initMap();
		return states.get(mode);
	}

}
