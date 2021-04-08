package ro.ase.cts.facade;

public class VerificatorPersoane {
	
	public static boolean isEligibile(Persoana persoana) {
		if(persoana.getVarsta() >= 18) {
			if(!Politie.isUrmarit(persoana)) {
				if(!BirouDeCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	}

}
