package ro.ase.cts.main;

import ro.ase.cts.strategy.*;

public class MainStrategy {

	public static void main(String[] args) {
		
		// DP-ul Strategy
		
		Client client = new Client("Alice");
		
		client.plateste(30);
		client.setTipPlata(new PlataCard());
		client.plateste(25);
	}

}
