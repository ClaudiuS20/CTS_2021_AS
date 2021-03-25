package ro.ase.cts.factorymethod;

public abstract class PersonalSpital {
	private String nume;

	public PersonalSpital(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}
	
}
