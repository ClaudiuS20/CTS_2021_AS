package ro.ase.cts.main;

import ro.ase.cts.memento.*;

public class MainMemento {

	public static void main(String[] args) {
		// DP-ul Memento

		Meci meci = new Meci("EchipaGazda","EchipaOaspeti",200,200,10,5);
		
		ManagerMemento managerMemento = new ManagerMemento();
		managerMemento.adaugaMemento(meci.creeazaMemento());
		
		meci.setNrSpectatori(180);
		managerMemento.adaugaMemento(meci.creeazaMemento());
		
		System.out.println(meci.toString());
		meci.seteazaMemento(managerMemento.cereUnMemento(0));
		System.out.println(meci.toString());
		meci.seteazaMemento(managerMemento.cereUltimulMemento());
		System.out.println(meci.toString());
	}

}
