import java.util.Scanner;

public class b_1837 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		int q = a/b;
		int r = a%b;
		
		if(r<0) {
			if(q<0) q--;
			else q++ ;
			// a = bq + r ; r = a-bq;
			r = a-(b*q);
		}
		System.out.println(q+" "+r);
		
		
		
		
		
		
		
		
		
		

	}

}
