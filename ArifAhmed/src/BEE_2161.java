import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_2161 {
	static Scanner in = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("0.0000000000");
	public static void main(String[] args) {
		 double n, ans = 0.0;
		    n = in.nextDouble();
		    while(n!=0)
		    {
		        ans+=6.0;
		        ans = 1.0/ans;
		        n--;
		    }
		    ans += 3.0;
		    System.out.println(df.format(ans));

	}

}
