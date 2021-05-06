package ro.ase.cts.state;

public class StareRezervata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Masa cu numarul "+masa.getNumar()+" este rezervata.");
			masa.setStare(this);
		}
		else
		{
			System.out.println("Masa nu poate fi rezervata.");
		}
	}

}
