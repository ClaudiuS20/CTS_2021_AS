package ro.ase.cts.flyweight;

public class Rezervare {
	
	private int nrMasa;
	private int nrPersoane;
	private int ora;
	
	public Rezervare(int nrMasa, int nrPersoane, int ora) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.ora = ora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrPersoane=");
		builder.append(nrPersoane);
		builder.append(", ora=");
		builder.append(ora);
		builder.append("]");
		return builder.toString();
	}

}
