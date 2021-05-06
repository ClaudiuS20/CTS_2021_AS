package ro.ase.cts.main;

import ro.ase.cts.state.*;

public class MainState {

	public static void main(String[] args) {
		
		// DP-ul State

		Masa masa1 = new Masa(10);
		
		masa1.elibereazaMasa();
		
		masa1.rezervaMasa();

		masa1.rezervaMasa();
		
		masa1.ocupaMasa();
	}

}
