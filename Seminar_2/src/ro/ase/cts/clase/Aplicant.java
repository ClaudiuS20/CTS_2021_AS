package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {

	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumiriProiecte;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afisareRaspunsProiect(Proiect proiect) {

		boolean esteAcceptat = punctaj >= proiect.getPragDeAcceptare();

		StringBuilder stringBuilder = new StringBuilder("Aplicantul ").append(nume).append(" ").append(prenume)
				.append(" ");
		stringBuilder.append(esteAcceptat ? "a fost acceptat." : "a fost respins.");

		System.out.println(stringBuilder.toString());
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte,
			String[] denumiriProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}

	public int getNumarProiecte() {
		return numarProiecte;
	}

	public void setNumarProiecte(int numarProiecte) {
		this.numarProiecte = numarProiecte;
	}

	public String[] getDenumiriProiecte() {
		return denumiriProiecte;
	}

	public void setDenumiriProiecte(String[] denumiriProiecte) {
		this.denumiriProiecte = denumiriProiecte;
	}

	public void setVectorDenumiri(String[] denumiriProiecte, int numarProiecte) {
		this.numarProiecte = numarProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}

	public abstract float getSumaFinantata();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", numar proiecte=");
		builder.append(numarProiecte);
		builder.append(", denumiri proiecte=");
		builder.append(Arrays.toString(denumiriProiecte));
		return builder.toString();
	}

}
