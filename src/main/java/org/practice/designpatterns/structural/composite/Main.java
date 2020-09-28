package org.practice.designpatterns.structural.composite;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-28
 */
public class Main {
	public static void main(String[] args) {
		Supervisor dean = buildComposite();
		HierarchyPrinter.getInstance()
						.print(dean);
	}

	private static Supervisor buildComposite() {
		Supervisor dean = new Supervisor("Dean", "Dean");

		Supervisor mathHod = new Supervisor("Math HOD", "math HOD");
		Supervisor csHod = new Supervisor("Computer Science HOD", "CS HOD");

		dean.addFaculty(mathHod);
		dean.addFaculty(csHod);

		Faculty algebraProf = new Professor("Algebra Prof", "Algebra");
		Faculty geometryProf = new Professor("Geometry Prof", "Geometry");

		mathHod.addFaculty(algebraProf);
		mathHod.addFaculty(geometryProf);

		Faculty osProf = new Professor("OS Prof", "OS");
		Faculty networkProf = new Professor("Network Prof", "Network");
		Faculty dbmsProf = new Professor("DBMS Prof", "DBMS");

		csHod.addFaculty(osProf);
		csHod.addFaculty(networkProf);
		csHod.addFaculty(dbmsProf);

		return dean;
	}
}
