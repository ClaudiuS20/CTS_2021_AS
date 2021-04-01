package ro.ase.cts.main;

import ro.ase.cts.adapter.Bilet;
import ro.ase.cts.adapter.BiletAdapter;
import ro.ase.cts.adapter.BiletAdapterClase;
import ro.ase.cts.adapter.IBiletOnline;

public class MainAdapter {
	
	private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vanzare();
	}
	
	private static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		
		//DP-ul Adapter (adapter de obiecte)
		
		Bilet bilet = new Bilet(30f);
		rezervaSiAfiseazaBiletLaCasa(bilet);
		
		IBiletOnline adapter = new BiletAdapter(bilet);
		rezervaSiAfiseazaBiletOnline(adapter);
		
		//Adapter de clase
		
		IBiletOnline adapterClase = new BiletAdapterClase(50);
		rezervaSiAfiseazaBiletOnline(adapterClase);
	}

}
