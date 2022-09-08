
import java.util.Scanner;

public class BEE_2313 {
	public static void main(String[] args)  {
		//1. Traingle can't be made without the max value smaller than the sum of
		//othertwo values ex: 4,6,2 here max is 6 other sum is 6 this can't be triangle
		//2. Rectangle can be formed if max(sq) = r1 (sq) + r2(sq);
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
	
		
		
		int new_max = max(max(a,b),c);
		int new_min = min(min(a,b),c);
		int leftover = a+b+c-new_max-new_min;
		if(new_max>= new_min+leftover) System.out.println("Invalido");
		else {
			if(a==b && b==c) System.out.println("Valido-Equilatero");
			else if(a==b || b==c || c==a ) System.out.println("Valido-Isoceles");
			else if(a!=b && b!=c && c!= a) System.out.println("Valido-Escaleno");
			
			if(Math.pow(new_max, 2)==Math.pow(new_min, 2)+Math.pow(leftover, 2)) {
				System.out.println("Retangulo: S");
			}
			else {
				System.out.println("Retangulo: N");
			}
		}
		in.close();

	}
	
	
	static int max(int g, int h) {
		return (g>h) ? g:h;
		
	}
	static int min(int g, int h) {
		return (g<h) ? g:h;
	}

}
