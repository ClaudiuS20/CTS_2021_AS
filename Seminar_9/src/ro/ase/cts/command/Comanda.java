package ro.ase.cts.command;

public abstract class Comanda {

	public abstract void executa();
	protected Masa masa;
	
	public Comanda(Masa masa) {
		super();
		this.masa = masa;
	}
	
}
