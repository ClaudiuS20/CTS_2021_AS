package ro.ase.cts.factorymethod;

public class Asistent extends PersonalSpital {

	public Asistent(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		return "Asistent: " + super.getNume();
	}
	
}
