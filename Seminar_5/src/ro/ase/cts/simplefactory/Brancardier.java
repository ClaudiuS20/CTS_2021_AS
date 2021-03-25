package ro.ase.cts.simplefactory;

public class Brancardier extends PersonalSpital {

	public Brancardier(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		return "Brancardier: " + super.getNume();
	}
	
}
