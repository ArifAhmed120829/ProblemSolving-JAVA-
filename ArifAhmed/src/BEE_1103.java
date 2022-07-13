import java.util.Scanner;

public class BEE_1103 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(;;) {
			int H1, M1, H2 , M2,res;
			res = 0;
			H1 = in.nextInt();
			M1 = in.nextInt();
			H2 = in.nextInt();
			M2 = in.nextInt();
			if(H1==0 & M1==0 & H2==0 & M2==0) break;
			int real_time = (H1*3600)+(M1*60);
			int alarm_time = (H2*3600)+(M2*60);
			if(alarm_time>real_time) {
				res = alarm_time-real_time;
				res = res/60;
			}
			else if(real_time>alarm_time) {
				res = 86400-real_time;
				res = alarm_time + res;
				res = res / 60;
			}
			System.out.println(res);
			
		}
		

	}

}
