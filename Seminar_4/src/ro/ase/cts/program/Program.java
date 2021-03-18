package ro.ase.cts.program;

import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Program {
	
	public static void main(String[] args) {
		Presedinte presedinte1 = Presedinte.getInstance();
		Presedinte presedinte2 = Presedinte.getInstance();
		
		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		presedinte1.setNume("Basescu");
		presedinte2.setMandat(3);
		
		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		PresedinteLazy presedinteLazy1 = PresedinteLazy.getInstance("presedinteLazy", 40, 4);
		PresedinteLazy presedinteLazy2 = PresedinteLazy.getInstance("presedinteLazy22", 50, 1);
		
		System.out.println(presedinteLazy1.toString());
		System.out.println(presedinteLazy2.toString());
	}

}
