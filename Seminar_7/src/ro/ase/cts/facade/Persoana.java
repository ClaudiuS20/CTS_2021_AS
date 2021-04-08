package ro.ase.cts.facade;

public class Persoana {
	
	private String nume;
	private String CNP;
	
	public Persoana(String nume, String CNP) {
		super();
		this.nume = nume;
		this.CNP = CNP;
	}
	
	public String getNume() {
		return nume;
	}
	
	public String getCNP() {
		return CNP;
	}
	
	public int getVarsta() {
		int an = 0;
		if(CNP.charAt(0)=='1'|| CNP.charAt(0)=='2')
			an=(1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
		if(CNP.charAt(0)=='3'|| CNP.charAt(0)=='4')
			an=(1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
		if(CNP.charAt(0)=='5'|| CNP.charAt(0)=='6')
			an=(2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)));
		return 2021 - an;
	}

}
