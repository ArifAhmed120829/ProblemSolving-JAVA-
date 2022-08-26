package Java_classes;

public class USA extends Countries {
	String location;
	
	@Override
	public void leadership() {
		super.leadership();
		System.out.println("Joe Biden");
	}
	
	public USA(String name, int population, String map) {
		super(name,population);
		this.location = map;
	}
	

}
