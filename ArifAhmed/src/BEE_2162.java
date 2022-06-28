import java.util.Scanner;

public class BEE_2162 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int t = in.nextInt();
		int res = 0;
		int l=0;
		int k = 1;
		int[] n = new int[t];
		for(int i = 0; i<t; i++) {
			n[i] = in.nextInt();
		}
		while(k!=t) {
			if(n[l]>n[k]) {
				res = 1;
				if(k+1<t) {
					if(n[k]<n[k+1]) {
						res = 1;
					}
					else {
						res = 0;
						k = t-1;
					}
				}
			}
			else if(n[l]<n[k]) {
				res = 1;
				if(k+1<t) {
					if(n[k]>n[k+1]) {
						res = 1;
					}
					else {
						res = 0;
						k = t-1;
					}
				}
			}
			else if(n[l]==n[k]) {
				res = 0;
				k = t-1;
			}
				
			
			k++;
			l++;
		}
		System.out.println(res);
	
	}

}
