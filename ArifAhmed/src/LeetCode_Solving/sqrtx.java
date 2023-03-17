package LeetCode_Solving;

public class sqrtx {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(sqr(n));

	}

	private static int sqr(int n) {
		int ans = 0;
		int low = 1;
		int high = n;
		while(low<=high) {
			int mid = low + (high - low)/2;
			if(n/mid==mid) { return mid;}
			else if(n/mid<mid) {high = mid - 1;}
			else if(n/mid>mid) {low = mid + 1; ans = mid;}
			
			
		}
		
		return ans;
	}

}
