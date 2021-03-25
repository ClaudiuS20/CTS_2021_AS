package ro.ase.cts.factorymethod;

public class FactoryInfirmier implements IFactory {

	@Override
	public PersonalSpital getPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Infirmier(nume);
	}

}
