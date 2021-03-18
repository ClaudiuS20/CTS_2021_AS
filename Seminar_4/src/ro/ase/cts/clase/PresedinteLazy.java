package ro.ase.cts.clase;

public class PresedinteLazy {

	private String nume;
	private int varsta;
	private int mandat;
	
	//instantierea lazy amana constructorul
	
	private static PresedinteLazy instance = null;
	
	public PresedinteLazy() {
		super();
		this.nume = "Presedinte";
		this.varsta = 40;
		this.mandat = 2;
	}

	public PresedinteLazy(String nume, int varsta, int mandat) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}
	
	public static synchronized PresedinteLazy getInstance(String nume, int varsta, int mandat) {
		if(instance == null) {
			instance = new PresedinteLazy(nume, varsta, mandat);
		}
		
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
