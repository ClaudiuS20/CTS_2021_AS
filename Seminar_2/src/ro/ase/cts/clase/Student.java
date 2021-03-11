package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static float sumaFinantare = 20;

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAn_studii() {
		return an_studii;
	}

	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}

	public Student() {
		super();

	}

	public float getSumaFinantata() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Student.sumaFinantare = sumaFinantare;
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect,
			String facultate, int an_studii) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Student: ").append(super.toString()).append("Facultate=").append(facultate).append("An studii=").append(an_studii);
		return stringBuilder.toString();
	}

	public static float getSumaFinantare() {
		return sumaFinantare;
	}
}
