import java.util.Scanner;

public class BEE_1929 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A,B,C,D;
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		D = in.nextInt();
		int i = 0;
		
		
			if(A+B>C) {
				if(B+C>A) {
					if(C+A>B) {
						System.out.println("S");
						i++;
						
						
					}
				}
			}
			if(D+B>C & i<=0) {
				if(B+C>D) {
					if(C+D>B) {
						System.out.println("S");
						i++;
					
					}
				}
			}
			if(A+D>C & i<=0) {
				if(D+C>A) {
					if(C+A>D) {
						System.out.println("S");
						i++;
					}
				}
			}
			if(A+B>D & i<=0) {
				if(B+D>A) {
					if(D+A>B) {
						System.out.println("S");
						i++;
					}
				}
			}
			if(i==0) {
				System.out.println("N");
				
				
			}

			
		
			
		
		

	}

}
