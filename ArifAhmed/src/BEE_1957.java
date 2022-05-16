import java.util.Scanner;

public class BEE_1957 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int V = in.nextInt();//104
		int Quotient  = V/16;//104/16=====6
		int[] rem;
		int i = 0;
		rem = new int[100];
		rem[i] = V%16;//rem[0] = 104%16======8
		
		//Store the reminder value
		//The last reminder will go to first
		while(Quotient!=0) {
			i++;//1
			rem[i] = Quotient%16;//rem[1] = 6%16 ====6
			Quotient = Quotient/16;//6/16===0	
		}
		for(int j = i; j>=0; j--) {
			if(rem[j]==10) {
				System.out.print("A");
			}
			else if(rem[j]==11) {
				System.out.print("B");
			}
			else if(rem[j]==12) {
				System.out.print("C");
			}
			else if(rem[j]==13) {
				System.out.print("D");
			}
			else if(rem[j]==14) {
				System.out.print("E");
			}
			else if(rem[j]==15) {
				System.out.print("F");
			}
			else {
				System.out.print(rem[j]);
			}
			
		}
		System.out.println();
		
		}
	

}
