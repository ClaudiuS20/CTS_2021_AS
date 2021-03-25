package ro.ase.cts.simplefactory;

public class FactoryPersonal {
	
	public PersonalSpital createPersonal(TipPersonal tip, String nume) {
		switch(tip) {
		case Asistent:
			return new Asistent(nume);
			
		case Brancardier:
			return new Brancardier(nume);
			
		case Medic:
			return new Medic(nume);
			
			default:
				throw new IllegalArgumentException();
		}
	}

}
