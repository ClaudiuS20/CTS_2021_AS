package ro.ase.cts.composite;

public class LeafFiliala implements ISediu {
	
	private String numeFiliala;

	public LeafFiliala(String numeFiliala) {
		super();
		this.numeFiliala = numeFiliala;
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Este filiala "+numeFiliala);
	}

	@Override
	public void addNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementat.");
	}

	@Override
	public void removeNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementat.");
	}

	@Override
	public ISediu getNod(int pozitie) throws Exception {
		throw new Exception("Nu este implementat.");
	}

}
