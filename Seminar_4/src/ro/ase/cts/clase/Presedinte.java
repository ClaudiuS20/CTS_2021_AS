package ro.ase.cts.clase;

public class Presedinte {
	
	private String nume;
	private int varsta;
	private int mandat;
	
	public Presedinte() {
		super();
		this.nume = "Putin";
		this.varsta = 68;
		this.mandat = 10;
	}

	public Presedinte(String nume, int varsta, int mandat) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}
	
	//instantiere eager
	
	private static Presedinte instance = new Presedinte();
	
	public static Presedinte getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Presedinte [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", mandat=");
		builder.append(mandat);
		builder.append("]");
		return builder.toString();
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setMandat(int mandat) {
		this.mandat = mandat;
	}

}
