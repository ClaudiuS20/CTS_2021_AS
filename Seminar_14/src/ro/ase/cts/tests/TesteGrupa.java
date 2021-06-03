package ro.ase.cts.tests;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;
import ro.ase.cts.tests.categories.ConstructorGrupaCategory;
import ro.ase.cts.tests.categories.GetPromovabilitateCategory;
import ro.ase.cts.tests.categories.TesteUrgenteCategory;

public class TesteGrupa {
	
	// teste pentru constructor

	// testul Right 1
	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorNumarGrupaCorect() {
		Grupa grupa=new Grupa(1081);
		assertEquals(1081,grupa.getNrGrupa());
	}
	
	// testul Right 2
	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testExistaListaConstructor() {
		Grupa grupa=new Grupa(1081);
		assertNotNull(grupa.getStudenti());
	}
	
	// testul Boundary 1
	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000,grupa.getNrGrupa());
	}
	
	// testul Boundary 2
	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100,grupa.getNrGrupa());
	}
	
	// testul Inverse - nu avem
	
	// testul Cross-check - nu avem
	
	// testul Error 1
	@Test(expected=IllegalArgumentException.class)
	@Category(ConstructorGrupaCategory.class)
	public void testExceptieConstructorInferior() {
		Grupa grupa=new Grupa(900);
	}
	
	// testul Error 2
	@Test(expected=IllegalArgumentException.class)
	@Category(ConstructorGrupaCategory.class)
	public void testExceptieConstructorSuperior() {
		Grupa grupa=new Grupa(1200);
	}
	
	// testul Performance
	@Test(timeout=500)
	@Category(ConstructorGrupaCategory.class)
	public void testPerformanceConstructor() {
		Grupa grupa=new Grupa(1081);
	}
	
	// testul Performance - JUnit5
	/*@Test
	public void testPerformanceConstructorJUnit5() {
		assertTimeout(Duration.ofMillis(500),()->{new Grupa(1081);});
	}*/
	
	// testul Conformance - nu avem
	
	// testul Ordering - nu avem
	
	// testul Range - realizat deja in Right 1, Boundary si Error conditions
	
	// testul Reference - nu avem
	
	// testul Existence - realizat deja in Right 2
	
	// testul Cardinality - realizat deja in Range
	
	// testul Time - realizat deja in Performance
	
	
	// teste pentru metoda getPromovabilitate
	
	// Right
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateRight() {
		Grupa grupa=new Grupa(1081);
		for(int i=0;i<10;i++) {
			IStudent student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.66f,grupa.getPromovabilitate(),0.1);
	}
	
	// Boundary 1
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateLimitaInferioara() {
		Grupa grupa=new Grupa(1001);
		for(int i=0;i<5;i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0,grupa.getPromovabilitate(),0.01);
	}
	
	// Boundary 2
	@Test
	@Category({GetPromovabilitateCategory.class,TesteUrgenteCategory.class})
	public void testGetPromovabilitateLimitaSuperioara() {
		Grupa grupa=new Grupa(1081);
		for(int i=0;i<10;i++) {
			IStudent student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(1,grupa.getPromovabilitate(),0.01);
	}
	
	// Inverse - nu
	
	// Cross-check - nu
	
	// Error
	@Test(expected=IndexOutOfBoundsException.class)
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateErrorCondition() {
		Grupa grupa=new Grupa(1050);
		
		grupa.getPromovabilitate();
	}
	
	// Conformance - nu
	
	// Ordering - nu
	
	// Range - Right, Boundary
	
	// Reference
	
	// Existence - Error
	
	// Cardinality - facut la 0 si n
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testeGetPromovabilitateCardinality1() {
		Grupa grupa=new Grupa(1081);
		IStudent student= new Student();
		student.adaugaNota(5);
		student.adaugaNota(6);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getPromovabilitate(),0.01);
	}
	
	// Time - Error
}
