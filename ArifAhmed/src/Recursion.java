class Factorial{
	int fact(int n) {
		int result;
		if(n==1) return 1;
		result =   n*fact(n-1);
		return result;
		
	}
	//Can you use return twice in a function?
	//You can't, it is only possible once.
}
public class Recursion {

	public static void main(String[] args) {
		Factorial f= new Factorial();
		System.out.println(f.fact(4));
		

	}

}
