import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE_2582 {
	static String zero(int Z) {
		return "PROXYCITY";
	}
	static String one(int Z) {
		return "P.Y.N.G.";
	}
	static String two(int Z) {
		return "DNSUEY!";
	}
	static String three(int Z) {
		return "SERVERS";
	}
	static String four(int Z) {
		return "HOST!";
	}
	static String five(int Z) {
		return "CRIPTONIZE";
	}
	static String six(int Z) {
		return "OFFLINE DAY";
	}
	static String seven(int Z) {
		return "SALT";
	}
	static String eight(int Z) {
		return "ANSWER!";
	}
	static String nine(int Z) {
		return "RAR?";
	}
	static String ten(int Z) {
		return "WIFI ANTENNAS";
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(in.readLine());
		
		for(int i = 0; i<test_case;i++) {
			String[] space = in.readLine().split(" ");
			int X = Integer.valueOf(space[0]);
			int Y = Integer.valueOf(space[1]); 
			int Z = X+Y;
			if(Z==1) {
				System.out.println(one(Z));
			}
			else if(Z==2) {
				System.out.println(two(Z));
			}
			else if(Z==3) {
				System.out.println(three(Z));
			}
			else if(Z==4) {
				System.out.println(four(Z));
			}
			else if(Z==5) {
				System.out.println(five(Z));
			}
			else if(Z==6) {
				System.out.println(six(Z));
			}
			else if(Z==7) {
				System.out.println(seven(Z));
			}
			else if(Z==8) {
				System.out.println(eight(Z));
			}
			else if(Z==9) {
				System.out.println(nine(Z));
			}
			else if(Z==10) {
				System.out.println(ten(Z));
			}
			else if(Z==0) {
				System.out.println(zero(Z));
			}
		}
		

	}

}
