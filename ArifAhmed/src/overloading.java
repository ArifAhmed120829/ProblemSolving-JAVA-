
public class overloading {
	static class Circle{
		Circle c;
		Circle(){
			this.c = null;
		}
	}
	static class Square{
		Square s;
		Square(){
			this.s = null;
		}
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		Circle ci = new Circle();
		Square sq = new Square();
		sum(a);
		sum(b,a);
		print(ci);
		print(sq);
	}

	private static void print(Square sq) {
		System.out.println(sq+" sq");
		
	}

	private static void print(Circle ci) {
		System.out.println(ci+" ci");
		
	}

	private static void sum(int a) {
		
		
	}
private static void sum(int b,int v) {
		
		
	}

}
