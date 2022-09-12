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
		String[] space;
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
				y = "";
				space = in.readLine().split(" ");
				int len = space.length;
				
				x = Integer.parseInt(space[0]);
				for(int p = 1; p<len; p++) {
					y = y+ space[p]+" ";
				}
				y = y.trim();//removing leading and trailing blank spaces meaning first and last spaces
				
				switch(y) {
				case "suco de laranja":
					result = suc_laranja(y)*x;
					
					break;
				case "morango fresco":
					result = morango(y)*x;
					break;
				case "mamao":
					result = mamao(y)*x;
					break;
				case "goiaba vermelha":
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
				//System.out.println(result);
				
				
			
				
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
