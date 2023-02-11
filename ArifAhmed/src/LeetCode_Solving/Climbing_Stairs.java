package LeetCode_Solving;


class hulafc{
	public int climbStairs(int n) {
	    if(n==1) return 1;
        if(n==2) return 2;

        int[] a =  new int[n];
        a[0]=1;
        a[1]=2;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
}

public class Climbing_Stairs {

	public static void main(String[] args) {
		hulafc hg = new hulafc();
		System.out.println(hg.climbStairs(4));

	}

	

}
