package package_1;

import java.util.Scanner;

public class bee_1961 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int frog = in.nextInt();//1
		int j = 0;
		int diff2 = 0;
		String z = null;
		if(frog>=1 && 5>=frog) {
			int total_pipe = in.nextInt();//2
			if(total_pipe>=2 && 100>=total_pipe) {
				
				for(int i = 0; i<total_pipe; i++) {
					
					int[] pipe;
					pipe = new int[total_pipe];
					 pipe[i] = in.nextInt();// 2,2 == you win
					 
					 if(i-1>=0) {
						 diff2 = j-pipe[i];
					 }
					
					 int diff = Math.abs(diff2);
					 if(diff>frog) {
						 z="GAME OVER";
						 break;
					 }
					 else if(diff<frog) {
						 z = "YOU WIN";
					 }
					 j = pipe[i];
					 
						
				}
				
				
			}
			
			
		}
		System.out.println(z);
		

	}

}
