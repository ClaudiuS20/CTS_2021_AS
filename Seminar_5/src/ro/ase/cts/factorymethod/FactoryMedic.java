package ro.ase.cts.factorymethod;

public class FactoryMedic implements IFactory {
	
	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Medic(nume);
	}

}
