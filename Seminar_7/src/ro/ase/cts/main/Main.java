package ro.ase.cts.main;

import ro.ase.cts.composite.CompositeAgentie;
import ro.ase.cts.composite.LeafFiliala;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.VerificatorPersoane;
import ro.ase.cts.proxy.Moneda;
import ro.ase.cts.proxy.OperatorCredite;
import ro.ase.cts.proxy.OperatorCrediteProxy;

public class Main {

	public static void main(String[] args) {
		
		// DP-ul Facade
		
		Persoana pers = new Persoana("Alex","1951015252675");
		if(VerificatorPersoane.isEligibile(pers)) {
			System.out.println("Persoana este eligibila.");
		}
		else {
			System.out.println("Persoana nu este eligibila.");
		}
		
		
		// DP-ul Proxy
		
		OperatorCredite operator = new OperatorCredite();
		operator.creareCredit(Moneda.EUR, 4000);
		
		OperatorCrediteProxy proxy = new OperatorCrediteProxy(operator);
		proxy.creareCredit(Moneda.EUR, 4000);
		proxy.creareCredit(Moneda.RON, 10000);
		
		
		// DP-ul Composite
		
		CompositeAgentie agentie01 = new CompositeAgentie();
		CompositeAgentie agentie02 = new CompositeAgentie();
		CompositeAgentie agentie03 = new CompositeAgentie();
		
		LeafFiliala filiala01 = new LeafFiliala("filiala01");
		LeafFiliala filiala02 = new LeafFiliala("filiala02");
		LeafFiliala filiala03 = new LeafFiliala("filiala03");
		LeafFiliala filiala04 = new LeafFiliala("filiala04");
		
		agentie01.addNod(filiala01);
		agentie01.addNod(filiala02);
		agentie01.addNod(agentie03);
		
		agentie02.addNod(filiala03);
		
		agentie03.addNod(filiala04);
		
		agentie01.afiseazaDescriere();
		System.out.println();
		agentie02.afiseazaDescriere();
		
		agentie03.removeNod(filiala04);
		agentie01.addNod(filiala04);
		
		agentie01.removeNod(agentie03);
		System.out.println();
		agentie01.afiseazaDescriere();
		System.out.println();
		agentie02.afiseazaDescriere();
	}

}
