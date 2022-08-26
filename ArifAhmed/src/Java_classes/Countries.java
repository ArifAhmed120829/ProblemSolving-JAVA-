package Java_classes;

public class Countries {
	String city_name;
	int city_population;
	
	public Countries() {
		
	}
	
	public  Countries(String name, int population) {
		this.city_name = name;
		this.city_population = population;
		
	}
	
	public void leadership() {
		System.out.println("This will return the leaders name of the country");
	}
	
	
	

}
