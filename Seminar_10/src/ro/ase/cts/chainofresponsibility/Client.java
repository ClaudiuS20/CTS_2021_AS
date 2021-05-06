package ro.ase.cts.chainofresponsibility;

public class Client {
	private String nume;
	private String nrTelefon;
	private String email;
	
	public String getNume() {
		return nume;
	}
	public String getNrTelefon() {
		return nrTelefon;
	}
	public String getEmail() {
		return email;
	}
	
	public Client(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}
}
