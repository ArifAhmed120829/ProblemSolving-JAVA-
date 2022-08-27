import java.util.Scanner;

public class BEE_1393 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		
		 
		while(true) {
			int l = 1;
			int first = 0;
			int res = first + l;
			x = in.nextInt();
			if(x==0) break;
			else if(x>1) {
				for(int i = 1; i<x; i++) {
					first = l;//first = 1,1,2
					
					l = res;// l = 1,2,3
					
					res = first+l;//res =2,3,5
				}
				System.out.println(res);
			}
			else if(x==1) {
				System.out.println(res);
			}
			
		}
			
		

	}

}
