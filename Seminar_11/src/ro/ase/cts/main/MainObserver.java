package ro.ase.cts.main;

import ro.ase.cts.observer.*;

public class MainObserver {

	public static void main(String[] args) {
		// DP-ul Observer
		
		Manager manager = new Manager();
		Client client1 = new Client("Dan");
		Client client2 = new Client("Razvan");
		Client client3 = new Client("Florin");
		
		manager.adaugaObservator(client1);
		manager.adaugaObservator(client2);
		manager.adaugaObservator(client3);
		
		manager.anuntaMeci("fotbal");
		
		manager.stergeObservator(client3);
		
		manager.anuntaMeci("handbal");
	}

}
