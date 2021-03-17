package ro.ase.cts.clase;

public class Elev extends Aplicant {

	private int clasa;
	private String tutore;
	private static float sumaFinantare = 30;

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public float getSumaFinantata() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Angajat: ").append(super.toString()).append(", clasa=").append(clasa).append(", tutore=")
				.append(tutore);
		return stringBuilder.toString();
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumiriProiecte,
			int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public static float getSumaFinantare() {
		return sumaFinantare;
	}

}
