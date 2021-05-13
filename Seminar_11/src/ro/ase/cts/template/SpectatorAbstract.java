package ro.ase.cts.template;

public abstract class SpectatorAbstract {
	public abstract void asezareLaCoada();
	public abstract void prezentareBilet();
	public abstract void realizareControlCorporal();
	public abstract void ocupareLoc();
	
	public final void intrareInStadion() {
		asezareLaCoada();
		prezentareBilet();
		realizareControlCorporal();
		ocupareLoc();
	}
}
