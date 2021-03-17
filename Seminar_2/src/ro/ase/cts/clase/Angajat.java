package ro.ase.cts.clase;

public class Angajat extends Aplicant {

	private String ocupatie;
	private int salariu;
	private static float sumaFinantare = 10;

	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public float getSumaFinantata() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumiriProiecte,
			int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumiriProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Angajat: ").append(super.toString()).append(", ocupatie=").append(ocupatie)
				.append(", salariu=").append(salariu);
		return stringBuilder.toString();
	}

	public static float getSumaFinantare() {
		return sumaFinantare;
	}

}
