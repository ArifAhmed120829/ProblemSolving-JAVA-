import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class heyyy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case1 = in.nextInt();
		int test_case2 = in.nextInt();
		ArrayList<Long> list1 = new ArrayList<Long>();
		ArrayList<Long> list2 = new ArrayList<Long>();
		long sum = 0;
		for(int i = 0; i<test_case1; i++) {
			long x = in.nextLong();
			list1.add(x);
		}
		for(int i = 0; i<test_case2; i++) {
			long y = in.nextLong();
			list2.add(y);
		}
		for(int i = 0; i<test_case2; i++) {
			long v = list2.get(i);
			long s;
			long ans = 0;
			int index = 0;
			for(int j = 0;j<test_case1; j++) {
				s= v-list1.get(j);
				if(j+1<test_case1) {
					if(s<v-list1.get(j+1)) {
						ans = s;
						
					}
					else {
						ans = v-list1.get(j+1);
						index++;
					}
				}
				
			}
			list1.remove(index);
			test_case1--;
			sum = sum + Math.abs(ans);
			
			System.out.println(sum);
		}
		System.out.println(sum);

	}

}
