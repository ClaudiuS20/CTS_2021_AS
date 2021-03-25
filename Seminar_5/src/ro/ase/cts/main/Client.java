package ro.ase.cts.main;

import ro.ase.cts.factorymethod.FactoryAsistent;
import ro.ase.cts.factorymethod.FactoryBrancardier;
import ro.ase.cts.factorymethod.FactoryInfirmier;
import ro.ase.cts.factorymethod.IFactory;
import ro.ase.cts.factorymethod.PersonalSpital;

public class Client {

	public static void afisareInformatiiPersonalSpital(IFactory factory, String nume) {
		PersonalSpital personalSpital = factory.getPersonal(nume);
		
		System.out.println(personalSpital.toString());
	}
	
	public static void main(String[] args) {
		
		afisareInformatiiPersonalSpital(new FactoryAsistent(),"Mircea");
		afisareInformatiiPersonalSpital(new FactoryBrancardier(),"Mihai");
		
		afisareInformatiiPersonalSpital(new FactoryInfirmier(),"Radu");
		
	}
}
