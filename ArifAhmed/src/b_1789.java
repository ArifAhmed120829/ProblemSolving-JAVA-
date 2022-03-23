import java.util.Scanner;

public class b_1789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int L ;
		int V;
		
		while(in.hasNext()) {
			int t1 = 0;
			int t2 = 0;
			int t3 = 0;
			L = in.nextInt();
			for(int i = 0; i<L; i++) {
				V = in.nextInt();
				if(V<10) t1++;
				else if(V>=10 && V<20) t2++;
				else t3++;
			
				
			}
			if(t3>0) System.out.println(3);
			else if(t2>0) System.out.println(2);
			else System.out.println(1);
		
		}
		 

	}

}
