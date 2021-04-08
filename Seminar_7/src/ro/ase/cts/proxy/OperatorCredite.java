package ro.ase.cts.proxy;

public class OperatorCredite implements IOperatorCredite {
	
	@Override
	public void creareCredit(Moneda moneda, int suma) {
		System.out.println("A fost oferit creditul in suma de " + suma + " " + moneda);
	}

}
