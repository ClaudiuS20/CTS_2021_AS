package ro.ase.cts.builder;

public class Rezervare {
	
	private int codRezervare;
	private boolean areMancare;
	private boolean areScaunErgonomic;
	private boolean areBautura;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	public Rezervare(int codRezervare, boolean areMancare, boolean areScaunErgonomic, boolean areBautura,
			boolean areMuzicaAmbientala, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areMancare = areMancare;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areBautura = areBautura;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzica = genMuzica;
	}
	
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	
	public void setAreMancare(boolean areMancare) {
		this.areMancare = areMancare;
	}
	
	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}
	
	public void setAreBautura(boolean areBautura) {
		this.areBautura = areBautura;
	}
	
	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}
	
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [codRezervare=");
		builder.append(codRezervare);
		builder.append(", areMancare=");
		builder.append(areMancare);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areBautura=");
		builder.append(areBautura);
		builder.append(", areMuzicaAmbientala=");
		builder.append(areMuzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append("]");
		return builder.toString();
	}
	
}
