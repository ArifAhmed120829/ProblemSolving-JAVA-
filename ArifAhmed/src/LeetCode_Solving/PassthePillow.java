package LeetCode_Solving;

public class PassthePillow {

	public static void main(String[] args) {
		int n = 18;//1,2,3,4,3,2
		int t = 38;
		int j = 0;
		int pos = 0;
		for(int i = 0; i<=t; i++) {
			if(j==n || pos!=0) {
				j--;
				pos++;
				if(j==1) pos = 0;
			}
			else if(j!=n && pos==0) {
				j++;
			}
			
		}
		System.out.println(j);
		

	}

}
