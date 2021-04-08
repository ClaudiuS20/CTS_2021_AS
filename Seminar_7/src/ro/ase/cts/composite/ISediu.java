package ro.ase.cts.composite;

public interface ISediu {

	public void afiseazaDescriere();
	public void addNod(ISediu sediu) throws Exception;
	public void removeNod(ISediu sediu) throws Exception;
	public ISediu getNod(int pozitie) throws Exception;
	
}
