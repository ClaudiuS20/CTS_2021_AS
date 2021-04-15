package ro.ase.cts.main;

import ro.ase.cts.decorator.DecoratorAbstract;
import ro.ase.cts.decorator.DecoratorCuLaMultiAni;
import ro.ase.cts.decorator.DecoratorUrarePaste;
import ro.ase.cts.decorator.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		
		// DP-ul Decorator
		
		NotaDePlata notaInitiala = new NotaDePlata(55);
		notaInitiala.printeaza();
		
		DecoratorAbstract decoratorLaMultiAni = new DecoratorCuLaMultiAni(notaInitiala);
		decoratorLaMultiAni.printeazaFelicitare();
		decoratorLaMultiAni.printeaza();
		
		DecoratorAbstract decoratorUrarePaste = new DecoratorUrarePaste(notaInitiala);
		decoratorUrarePaste.printeaza();
		
		NotaDePlata notaDePlata = new NotaDePlata(150);
		DecoratorAbstract decoratorLaMultiAni2 = new DecoratorCuLaMultiAni(notaDePlata);
		DecoratorAbstract decoratorUrarePaste2 = new DecoratorUrarePaste(decoratorLaMultiAni2);
		decoratorUrarePaste2.printeaza();

	}

}
