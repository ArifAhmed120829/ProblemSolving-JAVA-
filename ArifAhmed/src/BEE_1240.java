import java.util.Scanner;

public class BEE_1240 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int  i =0 ; i<N; i++) {
			int A = in.nextInt();//5678690
			int B = in.nextInt();//78690
			String res="";
			String A1 = String.valueOf(A);//5678690
			int length_of_A = A1.length();//7
			String B1 = String.valueOf(B);//78690
			int length_of_B = B1.length();//5
			int c = length_of_A - length_of_B;
			if(A==B) {
				System.out.println("encaixa");
			}
			/////
			else if(length_of_A>=length_of_B) {//7>=5
				for(int j =0; j<length_of_B;j++ ) { //0<5
					char g = A1.charAt(c);
					res = res + g;//
					c++;
				}
				if(res.equals(B1)) {
					System.out.println("encaixa");
				}
				else {
					System.out.println("nao encaixa");
				}
				
			}
			/////
			else if(length_of_A<length_of_B) {
				System.out.println("nao encaixa");
			}
			///
			
		}

	}

}
