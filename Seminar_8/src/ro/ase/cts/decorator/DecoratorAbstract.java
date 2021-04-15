package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements INota {
	
	private INota nota;

	public DecoratorAbstract(INota nota) {
		super();
		this.nota = nota;
	}

	@Override
	public void printeaza() {
		nota.printeaza();
	}
	
	public abstract void printeazaFelicitare();

}
