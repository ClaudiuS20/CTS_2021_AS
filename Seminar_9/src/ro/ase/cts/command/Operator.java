package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	
	private List<Comanda> comenzi;

	public Operator() {
		super();
		this.comenzi = new ArrayList<Comanda>();
	}
	
	public void invoca(Comanda comanda) {
		this.comenzi.add(comanda);
	}
	
	public void executaComanda() {
		comenzi.get(0).executa();
		comenzi.remove(0);
	}

}
