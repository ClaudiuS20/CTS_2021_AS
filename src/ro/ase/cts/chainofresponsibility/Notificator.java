package ro.ase.cts.chainofresponsibility;

public abstract class Notificator {
	private Notificator notificator;
	
	public abstract void trimiteNotificare(Client client,String text);

	public void setNotificator(Notificator notificator) {
		this.notificator = notificator;
	}

	public Notificator getNotificator() {
		return notificator;
	}
}
