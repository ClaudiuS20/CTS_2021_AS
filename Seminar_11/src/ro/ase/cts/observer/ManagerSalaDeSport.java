package ro.ase.cts.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaDeSport {
	private List<Observator> colectieObservatori;
	
	public ManagerSalaDeSport() {
		this.colectieObservatori = new ArrayList<>();
	}
	
	public void adaugaObservator(Observator observator) {
		colectieObservatori.add(observator);
	}
	
	public void stergeObservator(Observator observator) {
		colectieObservatori.remove(observator);
	}
	
	public void notificaObservatori(String mesajNotificare) {
		for(Observator o : colectieObservatori) {
			o.primesteMesaj(mesajNotificare);
		}
	}
}
