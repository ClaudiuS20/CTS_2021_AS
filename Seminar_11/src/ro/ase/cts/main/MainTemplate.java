package ro.ase.cts.main;

import ro.ase.cts.template.*;

public class MainTemplate {

	public static void main(String[] args) {
		// DP-ul Template
		
		SpectatorAbstract spectator = new Spectator("Ioan");
		
		SpectatorAbstract spectatorVIP = new SpectatorVIP("Narcis");
		
		spectator.intrareInStadion();
		spectatorVIP.intrareInStadion();
	}

}
