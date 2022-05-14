abstract class Dog{
	public void bark() {
		System.out.println("Woof Woof Arghhhhhh Woof Woof!");
	}
}
interface calculator{
	int button = 50;
	void calculate();
		
	
}
class adon extends Dog{
	
}
public class Abstractt implements calculator {
	public static void main(String[] args) {
		
		adon a = new adon();
		a.bark();
		Abstractt b = new Abstractt();
		System.out.println(button);
		b.calculate();

	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Press On to Start");
		
	}
	


}








