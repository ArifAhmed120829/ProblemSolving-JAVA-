package Java_classes;

public class main_countries {

	public static void main(String[] args) {
		USA myobj = new USA("Washington",7000000,"Washington DC is located in the north-eastern part of the United States.");
		myobj.leadership();
		System.out.println(myobj.city_name+" is the name of the city");
		System.out.println(myobj.city_population+" the poulation of that city");
		System.out.println(myobj.location);

	}

}
