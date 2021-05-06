package ro.ase.cts.main;

import ro.ase.cts.chainofresponsibility.*;

public class MainChain {

	public static void main(String[] args) {
		
		// DP-ul Chain of Responsibility
		
		Client client1 = new Client("Ion",null,null);
		Client client2 = new Client("Maria","074744747",null);
		Client client3 = new Client("Ana",null,"aha@gmail.com");
				
		NotificatorSMS notificatorSMS = new NotificatorSMS();
		NotificatorEmail notificatorEmail = new NotificatorEmail();
		notificatorSMS.setNotificator(notificatorEmail);
		notificatorSMS.trimiteNotificare(client3, "Mesaj1");
	}

}
