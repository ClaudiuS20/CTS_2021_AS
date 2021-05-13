package ro.ase.cts.template;

public class SpectatorVIP extends SpectatorAbstract {
	private String nume;

	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println(this.nume + " nu a mai stat la coada pentru ca e VIP.");
	}

	@Override
	public void prezentareBilet() {
		System.out.println(this.nume + " a prezentat un bilet VIP.");
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(this.nume + " a fost controlat la intrare.");
	}

	@Override
	public void ocupareLoc() {
		System.out.println(this.nume + " si-a ocupat locul la loja.");
	}
	
}
