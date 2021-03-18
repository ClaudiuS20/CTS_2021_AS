package ro.ase.cts.clase;

public class Casa {
	
	private int numarEtaje;
	private String strada;
	private float pret;
	
	private static Casa instance = null;
	
	private Casa() {
		super();
		this.numarEtaje = 4;
		this.strada = "Teiului";
		this.pret = 165;
	}

	private Casa(int numarEtaje, String strada, float pret) {
		super();
		this.numarEtaje = numarEtaje;
		this.strada = strada;
		this.pret = pret;
	}

	public void setNumarEtaje(int numarEtaje) {
		this.numarEtaje = numarEtaje;
	}

	public void setStrada(String strada) {
		this.strada = strada;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Casa [numarEtaje=");
		builder.append(numarEtaje);
		builder.append(", strada=");
		builder.append(strada);
		builder.append(", pret=");
		builder.append(pret);
		builder.append("]");
		return builder.toString();
	}

	public static synchronized Casa getInstance(int numarEtaje, String strada, float pret) {
		if(instance == null) {
			instance = new Casa(numarEtaje, strada, pret);
		}
		
		return instance;
	}
	
}
