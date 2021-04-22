package ro.ase.cts.main;

import ro.ase.cts.command.Comanda;
import ro.ase.cts.command.ComandaOcupare;
import ro.ase.cts.command.ComandaRezervare;
import ro.ase.cts.command.Masa;
import ro.ase.cts.command.Operator;
import ro.ase.cts.flyweight.Flyweight;
import ro.ase.cts.flyweight.FlyweightFactory;
import ro.ase.cts.flyweight.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		// DP-ul Flyweight
		
		Rezervare rezervare1 = new Rezervare(10,5,15);
		Rezervare rezervare2 = new Rezervare(42,7,10);
		Rezervare rezervare3 = new Rezervare(19,2,14);
		Rezervare rezervare4 = new Rezervare(15,1,20);
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Flyweight client1 = flyweightFactory.getFlyweight("0727300");
		client1.printeazaRezervare(rezervare1);
		
		flyweightFactory.getFlyweight("0727300").printeazaRezervare(rezervare2);
		flyweightFactory.getFlyweight("0727999").printeazaRezervare(rezervare3);
		flyweightFactory.getFlyweight("0727999").printeazaRezervare(rezervare4);
		
		// DP-ul Command

		Masa masa = new Masa(1);
		Masa masa1 = new Masa(2);
		
		Comanda comandaRezervare = new ComandaRezervare(masa);
		Comanda comandaOcupare = new ComandaOcupare(masa1);
		Comanda comandaOcupare1 = new ComandaOcupare(masa1);
		
		Operator operator = new Operator();
		operator.invoca(comandaRezervare);
		operator.executaComanda();
		operator.invoca(comandaOcupare);
		operator.invoca(comandaOcupare1);
		
		operator.executaComanda();
		operator.executaComanda();
	}

}
