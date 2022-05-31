import java.util.Scanner;

public class BEE_1973 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
			int N = in.nextInt();//5
			int i = 0;
			int j = 0;
			int[] X;
			X  = new int[N];
			int sum = 0;
			for( i = 0; i<N; i++) {//0,1,2,3,4
				 X[i] = in.nextInt();//3+3+2+3+3 = 14
				
					sum= sum +X[i];
					//sum = 14
					
			}
			
			
				for( i = 0; i<N; i++) {//0,1,2,3,4
					if(X[i]%2!=0) {//3+3||2+3+3
						sum--;//i = 2 & sum = sum - 2 ; sum = 12
						j++;//2
					}
					else {
						break;
					}
				}
				if(i<N) {//2<5
					if(X[i]%2==0) {//2%2==0
						for(int k = 0; k<i; i--) {//0<2->2,1
							sum--;//12-2 = 10
						}
						j++;//3
						
					}
				}
				
				
					
			
			System.out.println(j+" "+sum);
		}
	}


