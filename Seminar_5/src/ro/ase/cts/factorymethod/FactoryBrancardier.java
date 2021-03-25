package ro.ase.cts.factorymethod;

public class FactoryBrancardier implements IFactory {

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Brancardier(nume);
	}
	
}
