package Java_classes;

public class Book {
	String swap;
	String buy;
	String sell;
	
	public Book() {
		System.out.println("This is empty constructor");
	}
	public Book(String exchange,String buy,String sell) {
		this.swap = exchange;
		this.buy = buy;
		this.sell = sell;
	}

}
