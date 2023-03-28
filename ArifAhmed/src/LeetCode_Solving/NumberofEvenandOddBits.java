package LeetCode_Solving;

public class NumberofEvenandOddBits {
	public static void main(String[] args) {
		int main = 75;
		for(int val:evenodd(main)) {
			System.out.println(val);
		}

	}

	private static int[] evenodd(int main) {
		int[] arr = new int[2];
		int even=0,odd=0, n =2,c = 0;
		if(n>main) {
			even = 1;
			arr[0] = even;
			arr[1] = odd;
			return arr;
		}
		else {
			while( n<= main) {
				n = n*2;
				c++;
			}
			n = n/2;
			while(n!=1) {
				if(c%2==0) {
					even++;
				}
				else {
					odd++;
				}
				main = main - n;//75-64
				while(n>main && n!=1) {
					n = n/2;
					c--;
					
				}
				if(main==1) {
					if(c%2==0) {
						even++;
					}
					else {
						odd++;
					}
				}
				
			}
			arr[0] = even;
			arr[1] = odd;
			return arr;
		}
		
		
	}

}
