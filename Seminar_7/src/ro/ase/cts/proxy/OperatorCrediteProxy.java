package ro.ase.cts.proxy;

public class OperatorCrediteProxy implements IOperatorCredite {
	
	private OperatorCredite operator;

	public OperatorCrediteProxy(OperatorCredite operator) {
		super();
		this.operator = operator;
	}

	@Override
	public void creareCredit(Moneda moneda, int suma) {
		if(moneda == Moneda.RON) {
			operator.creareCredit(moneda, suma);
		}
		else
		{
			System.out.println("Banca la acest moment ofera credite exclusiv in RON.");
		}
	}

}
