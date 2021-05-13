package ro.ase.cts.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> mementoList;
	
	public ManagerMemento() {
		this.mementoList=new ArrayList<>();
	}
	
	public void adaugaMemento(Memento memento) {
		mementoList.add(memento);
	}
	
	public Memento cereUnMemento(int index) {
		if(index>=0 && index<mementoList.size()) {
			return mementoList.get(index);
		}
		return null;
	}
	
	public Memento cereUltimulMemento() {
		return mementoList.get(mementoList.size()-1);
	}
}
