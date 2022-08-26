
import java.math.BigInteger;
import java.util.Scanner;

public class BEE_2334 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger x;
		BigInteger reallysmall = new BigInteger("0");
		BigInteger reallysmall2 = new BigInteger("1");
		BigInteger reallysmall3 = new BigInteger("-1");
		do{
			
			x = in.nextBigInteger();
			if(x.equals(reallysmall3)) break;
			if(x.equals(reallysmall)) {
				System.out.println(x);
			}
			else  {
				System.out.println(x.subtract(reallysmall2));
			}
			
		}while(!x.equals(reallysmall3));
		
		

	}

}
