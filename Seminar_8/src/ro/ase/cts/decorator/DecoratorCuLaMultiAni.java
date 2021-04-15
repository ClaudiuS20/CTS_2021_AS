package ro.ase.cts.decorator;

public class DecoratorCuLaMultiAni extends DecoratorAbstract {

	public DecoratorCuLaMultiAni(INota nota) {
		super(nota);
	}
	
	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: La multi ani!");
	}

	@Override
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani!");
	}

}
