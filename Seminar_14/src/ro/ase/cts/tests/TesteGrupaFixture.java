package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;
import ro.ase.cts.tests.categories.GetPromovabilitateCategory;
import ro.ase.cts.tests.categories.TesteUrgenteCategory;

public class TesteGrupaFixture {
	private Grupa grupa;

	@Before
	public void setup() {
		grupa = new Grupa(1081);
		for(int i=0;i<20;i++) {
			IStudent student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<15;i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
	}
	
	// Performance
	@Test(timeout = 500)
	@Category({GetPromovabilitateCategory.class,TesteUrgenteCategory.class})
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}

}
