package ro.ase.cts.state;

public class Masa {
	private Stare stare;
	private int numar;
	
	public Masa(int numar) {
		super();
		this.numar = numar;
		this.stare = new StareLibera();
	}

	public Stare getStare() {
		return stare;
	}

	protected void setStare(Stare stare) {
		this.stare = stare;
	}

	public int getNumar() {
		return numar;
	}
	
	public void rezervaMasa() {
		StareRezervata rezervata = new StareRezervata();
		rezervata.modificaStare(this);
	}
	
	public void ocupaMasa() {
		StareOcupata ocupata = new StareOcupata();
		ocupata.modificaStare(this);
	}
	
	public void elibereazaMasa() {
		StareLibera libera = new StareLibera();
		libera.modificaStare(this);
	}
}
