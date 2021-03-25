package ro.ase.cts.main;

import ro.ase.cts.simplefactory.FactoryPersonal;
import ro.ase.cts.simplefactory.PersonalSpital;
import ro.ase.cts.simplefactory.TipPersonal;

public class Main {
	
	public static void main(String[] args) {
		FactoryPersonal factoryPersonal = new FactoryPersonal();
		
		PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "David");
		PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic, "Razvan");
		
		System.out.println(asistent);
		System.out.println(medic);
	}

}
