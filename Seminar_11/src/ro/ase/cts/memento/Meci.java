package ro.ase.cts.memento;

public class Meci {
	private String echipaGazda;
	private String echipaOaspeti;
	private int nrBileteVandute;
	private int nrSpectatori;
	private int nrJandarmi;
	private int nrStewarzi;
	
	public Meci(String echipaGazda, String echipaOaspeti, int nrBileteVandute, int nrSpectatori, int nrJandarmi,
			int nrStewarzi) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOaspeti;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSpectatori = nrSpectatori;
		this.nrJandarmi = nrJandarmi;
		this.nrStewarzi = nrStewarzi;
	}

	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}

	public void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	public void setNrStewarzi(int nrStewarzi) {
		this.nrStewarzi = nrStewarzi;
	}
	
	public Memento creeazaMemento() {
		Memento memento = new Memento(this.nrSpectatori,this.echipaGazda,this.echipaOaspeti);
		return memento;
	}
	
	public void seteazaMemento(Memento memento) {
		this.nrSpectatori=memento.getNrSpectatori();
		this.echipaGazda=memento.getNumeEchipaGazda();
		this.echipaOaspeti=memento.getNumeEchipaOaspeti();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meci [echipaGazda=");
		builder.append(echipaGazda);
		builder.append(", echipaOaspeti=");
		builder.append(echipaOaspeti);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append(", nrStewarzi=");
		builder.append(nrStewarzi);
		builder.append("]");
		return builder.toString();
	}
}
