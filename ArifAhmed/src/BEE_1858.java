import java.util.Scanner;

public class BEE_1858 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = in.nextInt();
		int []  T = new int[N];
		for(int i = 0; i <N; i++) {
			T[i] = in.nextInt();
		}
		
		int min = T[0];
		int k = 0;
		int j = 1;
		int l = 0;
		while(j!=N) {
			if(min<T[j]) {
				l=j;
			}
			else {
				if(min==T[j]) {
					
					
				}
				else {
					min = T[j];
					k = j;
					
				}
			}
			j++;
		}
		
		
		
		//System.out.println(min);
		System.out.println(k+1);
		

	}

}
