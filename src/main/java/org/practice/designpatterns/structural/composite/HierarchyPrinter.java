package org.practice.designpatterns.structural.composite;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-28
 */
public class HierarchyPrinter {

	public static HierarchyPrinter instance;
	private static final String TAB = "\t";
	private static final String NEW_LINE = "\n";

	private HierarchyPrinter() {
	}
	
//	static {
//		System.out.println("loaded in jvm");
//	}

	public static HierarchyPrinter getInstance() {
		if (instance == null) {
			synchronized (HierarchyPrinter.class) {
				if (instance == null) {
//					System.out.println("instantiating");
					instance = new HierarchyPrinter();
				}
			}
		}
		return instance;
	}

	public void print(Supervisor supervisor) {
		StringBuilder sb = new StringBuilder();
		print(supervisor, 0, sb);
		System.out.println(sb);
	}

	private void print(Supervisor supervisor, int tab, StringBuilder sb) {

		printTabs(tab, sb);
		printFaculy(sb, supervisor);

		for (Faculty faculty : supervisor.getFaculties()) {
			if (faculty instanceof Supervisor)
				print((Supervisor) faculty, tab + 1, sb);
			else {
				printTabs(tab + 1, sb);
				printFaculy(sb, faculty);
			}
		}
	}

	private void printFaculy(StringBuilder sb, Faculty faculty) {
		sb	.append(faculty.getDetails())
			.append(NEW_LINE);
	}

	private void printTabs(int tab, StringBuilder sb) {
		for (int i = 1; i <= tab; i++) {
			sb.append(TAB);
		}
	}
}
