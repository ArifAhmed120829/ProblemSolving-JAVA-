import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE_2486 {
	static int suc_laranja(String name) {
		return 120;
	}
	static int morango(String name) {
		return 85;
	}
	static int mamao(String name) {
		return 85;
	}
	static int goiaba(String name) {
		return 70;
	}
	static int manga(String name) {
		return 56;
	}
	static int laranja(String name) {
		return 50;
	}
	static int brocolis(String name) {
		return 34;
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] space = new String[2];
		int sum;
		int x;
		String y;
		int real_result;
		while(true) {
			
			sum = 0;
			int result = 0;
			int t = Integer.parseInt(in.readLine());
			if(t==0) break;
			for(int i = 0; i<t; i++) {
				space = in.readLine().split(" ");
				x = Integer.parseInt(space[0]);
				y = space[1];
				switch(y) {
				case "suco":
					result = suc_laranja(y)*x;
					
					break;
				case "morango":
					result = morango(y)*x;
					break;
				case "mamao":
					result = mamao(y)*x;
					break;
				case "goiaba":
					result = goiaba(y)*x;
					break;
				case "manga":
					result = manga(y)*x;
					break;
				case "laranja":
					result = laranja(y)*x;
					break;
				case "brocolis":
					result = brocolis(y)*x;
					break;
				}
				sum = sum + result;
				
				
			
				
			}
			if(sum>130) {
				real_result = sum - 130;
				System.out.println("Menos "+real_result+" mg");
			}
			else if(sum<110) {
				real_result = 110 - sum;
				System.out.println("Mais "+real_result+" mg");
			}
			else if(sum>=110 && sum<=130) {
				System.out.println(sum+" mg");
			}
			
			
		}
		

}
}
