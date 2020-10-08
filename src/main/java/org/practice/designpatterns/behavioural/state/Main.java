package org.practice.designpatterns.behavioural.state;

import org.practice.designpatterns.behavioural.state.fsmdemo.StateFactory;
import org.practice.designpatterns.behavioural.state.fsmdemo.StateFactory.StateMode;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-08
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("DFA which accepts string containing \"ab\" \n");
		
		StateFactory factory = StateFactory.getInstance();
		State<Character> initialState = factory.getState(StateMode.INITIAL);
		FiniteStateMachine<Character> machine = new FiniteStateMachineImpl<>(initialState);
		
		String testCases[]= {
				"ab",
				"abb",
				"aba",
				"a",
				"b"
		};
		
		for(String testCase: testCases) {
			Character[] arr = getBoxedCharArray(testCase);
			boolean result = machine.parse(arr);
			System.out.printf("%s accepted: %s\n",testCase, result);
			machine.setCurrentState(initialState);
		}
		
	}
	
	public static Character[] getBoxedCharArray(String str) {
		char[] charArray = str.toCharArray();
		Character[] boxedChar = new Character[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			boxedChar[i] = Character.valueOf(charArray[i]);
		}
		return boxedChar;
	}
}
