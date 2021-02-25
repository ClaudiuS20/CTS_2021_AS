package clase;

public class Zookeeper {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Zookeeper(String name) {
		super();
		this.name = name;
	}
	
	public void feed(Animal animal) {
		System.out.println(name+" hraneste animalul "+animal.getName());
	}
}
