package pachet;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Program {
	
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Girafa g1 = new Girafa("g1");
		Girafa g2 = new Girafa("g2");
		
		Zebra z1 = new Zebra("z1",3);
		Zebra z2 = new Zebra("z2",6);
		
		zoo.adauga(g1);
		zoo.adauga(g2);
		
		zoo.adauga(z1);
		zoo.adauga(z2);
		
		zoo.feedAllAnimals();
    }
}
