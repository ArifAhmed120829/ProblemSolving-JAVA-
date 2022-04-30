import java.util.Scanner;

public class TDA_1022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 1; i <= test_case ; i++) { // 4
			int x = in.nextInt(); // 1
			char op1 = in.next().charAt(0); // /
			int y = in.nextInt();// 2
			
			char op = in.next().charAt(0); // +
			
			int x2 = in.nextInt(); // 3
			char op2 = in.next().charAt(0); // /
			int y2 = in.nextInt();// 4
			
			int den = 0;
			int num = 0;
			
			// Sum: (N1*D2 + N2*D1) / (D1*D2)
			//Subtraction: (N1*D2 - N2*D1) / (D1*D2)
			//Multiplication: (N1*N2) / (D1*D2)
			//Division: (N1/D1) / (N2/D2), that means (N1*D2)/(N2*D1)
			
			switch(op) {
			case '+':
				den = y*y2; 
				num = ((x*y2)+(x2*y) ); 
				break;
			case '-':
				den = y*y2; 
				num = ((x*y2)-(x2*y) );
				break;
			case '*':
				den = y*y2; 
				num = (x*x2);
				break;
			case '/':
				den = x2*y; 
				num = (x*y2);
				break;
			}
			System.out.print(num+"/"+den+" = ");
			main2(num,den);
			
		}
		
		
	}
	public static void main2(int num, int den) {
		if(num>den) {//10/8
			for(int i = num/2; i>0; i--) {
				if(num%i==0 && den%i==0) {
					System.out.println(num/i + "/" + den/i);
					break;
				}
			}
		}
		else if(den>num) {//10/8
			for(int i = den/2; i>0; i--) {
				if(num%i==0 && den%i==0) {
					System.out.println(num/i + "/" + den/i);
					break;
				}
			}
		}
		else {
			System.out.println(1 + "/" + 1);
		}
	}

}
