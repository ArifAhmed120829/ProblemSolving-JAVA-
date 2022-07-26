import java.util.Scanner;

public class BEE_1429 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(;;) {
			String number = in.next();//99999
			if(number.equals("0")) break;
			int len = number.length();//5
			int y = len-1;//4
			int sum = 0;
			int m = 1;
			int fac = 1;
			int r ;
			for(int j = len; j>0;j--) {
				char c = number.charAt(y);//4->9,
				r = Character.getNumericValue(c);//9,
				 r = r *fac;//9*1!,
				sum = sum + r;//0+9,
				int z = m;
				m++;//2!,
				int multi =0;
				int res = 1;
				if(m>1) {
					while(z!=0) {
						multi = m-z;
						res = res * multi;
						z--;
					}
				}
				fac = m*res;
				y--;//2,
			}
			System.out.println(sum);
		}

	}

}
