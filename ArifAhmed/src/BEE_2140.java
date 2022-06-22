import java.util.Scanner;

public class BEE_2140 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		for(;;) {
			int buy_price = in.nextInt();
			int paid = in.nextInt();
			int res = paid-buy_price;
			if(buy_price==0 && paid==0) {
				break;
			}
			else {
				if(res-(2+5)==0) System.out.println("possible");
				else if(res-(2+10)==0) System.out.println("possible");
				else if(res-(2+20)==0) System.out.println("possible");
				else if(res-(2+50)==0) System.out.println("possible");
				else if(res-(2+100)==0) System.out.println("possible");
				else if(res-(5+10)==0) System.out.println("possible");
				else if(res-(5+20)==0) System.out.println("possible");
				else if(res-(5+50)==0) System.out.println("possible");
				else if(res-(5+100)==0) System.out.println("possible");
				else if(res-(10+20)==0) System.out.println("possible");
				else if(res-(10+50)==0) System.out.println("possible");
				else if(res-(10+100)==0) System.out.println("possible");
				else if(res-(20+50)==0) System.out.println("possible");
				else if(res-(20+100)==0) System.out.println("possible");
				else if(res-(50+100)==0) System.out.println("possible");
				else {
					System.out.println("impossible");
				}
			}
		}

	}

}
