package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.tests.categories.GetPromovabilitateCategory;
import ro.ase.cts.tests.mocks.DummyStudent;
import ro.ase.cts.tests.mocks.FakeStudent;
import ro.ase.cts.tests.mocks.StubStudent;

public class TesteGrupaMock {

	// Mock; s-a adaugat un student?
	@Test
	public void testAdaugaStudentMockStudent() {
		IStudent student = new DummyStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);
		assertEquals("Adaugare student", 1, grupa.getStudenti().size());
	}
	
	// Stub; studentul a promovat?
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateStubStudent() {
		IStudent student = new StubStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}
	
	// Fake; test Right
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateFakeStudent() {
		Grupa grupa = new Grupa(1081);
		for(int i=0;i<8;i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestante(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.8f, grupa.getPromovabilitate(), 0.015);
	}

}
