package package_1;

public class Shirt {
	String color;
	char size;
	int price;
	Shirt(){
		System.out.println("This is inside the constructor");
	}
	
	Shirt(String newcolor, char newsize, int newprice){
		color = newcolor;
		size = newsize;
		price = newprice;
	}
	
	public static void puton() {
		System.out.println("Shirt is being weared");
	}
	public static void takeoff() {
		System.out.println("Shirt is being wear off");
	}
	

}
