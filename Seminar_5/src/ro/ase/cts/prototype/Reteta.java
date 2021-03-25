package ro.ase.cts.prototype;

public class Reteta implements PrototipAbstract {
	
	private String denumireSolutie;
	private int cantitateSolutie;
	
	public Reteta(String denumireSolutie, int cantitateSolutie) {
		super();
		//validari
		this.denumireSolutie = denumireSolutie;
		this.cantitateSolutie = cantitateSolutie;
	}
	
	private Reteta() {
		//nu mai face validari
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [denumireSolutie=");
		builder.append(denumireSolutie);
		builder.append(", cantitateSolutie=");
		builder.append(cantitateSolutie);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public PrototipAbstract copiaza() {
		Reteta copie = new Reteta();
		copie.cantitateSolutie = this.cantitateSolutie;
		copie.denumireSolutie = this.denumireSolutie;
		return copie;
	}
	
}
