package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	// testare constructor cu parametru
	@Test
	public void testConstructorCuParametru() {
		String nume="Costica";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
		assertNotNull(student.getNote());
	}
	
	// testare constructor fara parametri
	@Test
	public void testConstructorFaraParametri() {
		Student student = new Student();
		
		assertNotNull("Atributul note nu a fost initializat",student.getNote());
		assertNotNull("Atributul nume nu a fost initializat",student.getNume());
	}

	// testare metoda adauga nota
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		
		int nota=5;
		student.adaugaNota(5);
		assertEquals(nota,student.getNota(0));
	}
	
	// testare metoda adauga nota - dimensiune vector
	@Test
	public void testAdaugaNotaDimensiune() {
		Student student = new Student();
		
		student.adaugaNota(5);
		
		student.adaugaNota(8);
		
		assertEquals(2,student.getNote().size());
	}
	
	// testare metoda calculeaza medie
	@Test
	public void testCalculeazaMedieNote() {
		Student student = new Student();
		
		student.adaugaNota(5);
		
		student.adaugaNota(8);
		
		assertEquals(6.5f,student.calculeazaMedie(),0.1);
	}
	
	// testare metoda calculeaza medie - fara note
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		
		assertEquals(0,student.calculeazaMedie(),0.1);
	}
	
	// testare metoda calculeaza medie - cu note
	@Test
	public void testCalculeazaMedieCuNote() {
		Student student = new Student();
		student.adaugaNota(5);
			
		assertEquals(5,student.calculeazaMedie(),0.1);
	}
	
	// testare metoda are restante - da
	@Test
	public void testAreRestanteAdevarat() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(3);
		assertTrue(student.areRestante());
	}
	
	// testare metoda are restante - nu
	@Test
	public void testAreRestanteFals() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(8);
		assertFalse(student.areRestante());
	}
	
	// testare metoda get nota - exception
	@Test
	public void testGetNotaExceptie() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(7);
		
		try {
			student.getNota(5);
			fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie.");
		} catch (IndexOutOfBoundsException e) {
			
		}
		catch (Exception e) {
			fail("Metoda arunca o alta exceptie.");
		}
	}
	
	// testare getNota - asteptare exceptie - JUnit4
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaExceptieV4() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(7);
		
		student.getNota(5);
	}
	
	// testare getNota - asteptare exceptie - JUnit5 - merge doar la varianta 5
	/*@Test
	public void testGetNotaExceptieV5() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(6);
		
		assertThrows(IndexOutOfBoundsException.class,() -> {student.getNota(5);});
	}*/
}
