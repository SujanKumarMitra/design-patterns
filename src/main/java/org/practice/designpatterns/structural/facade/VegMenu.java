package org.practice.designpatterns.structural.facade;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-01
 */
public class VegMenu implements Menu {

	@Override
	public List<String> getItems() {
		return Arrays.asList("Paneer","Bread","Butter","Salad");
	}

}
