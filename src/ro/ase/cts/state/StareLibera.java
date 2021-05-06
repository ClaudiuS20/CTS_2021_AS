package ro.ase.cts.state;

public class StareLibera implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Nu putem face aceasta modificare!");
		}
		else
		{
			masa.setStare(this);
			System.out.println("Masa cu nr "+masa.getNumar()+" a fost eliberata!");
		}
	}

}
