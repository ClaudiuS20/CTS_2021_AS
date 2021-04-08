package ro.ase.cts.facade;

class Politie {
	
	public static boolean isUrmarit(Persoana persoana) {
		if(Integer.parseInt("" + persoana.getCNP().charAt(12)) %2 == 0) {
			return true;
		}
		else return false;
	}

}
