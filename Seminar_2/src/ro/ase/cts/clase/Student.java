package ro.ase.cts.clase;

public class Student extends Aplicant {

	protected String facultate;
	protected int anStudii;
	private static float sumaFinantare = 20;

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
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

	public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumiriProiecte,
			String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Student: ").append(super.toString()).append(", facultate=").append(facultate)
				.append(", an studii=").append(anStudii);
		return stringBuilder.toString();
	}

	public static float getSumaFinantare() {
		return sumaFinantare;
	}
}
