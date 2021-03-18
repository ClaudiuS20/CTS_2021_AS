package ro.ase.cts.program;

import ro.ase.cts.clase.Casa;
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
		
		
		Casa casa1 = Casa.getInstance(3, "Mircea", 700);
		Casa casa2 = Casa.getInstance(1, "Junimea", 900);
		
		System.out.println(casa1.toString());
		System.out.println(casa2.toString());
		
		casa1.setPret(1000);
		casa2.setStrada("Libertatii");
		
		System.out.println(casa1.toString());
		System.out.println(casa2.toString());
	}

}
