
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class NumberFrequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		int[] arr = new int[test_case];
		for(int i = 0; i<test_case; i++) {
			arr[i] = in.nextInt();
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<test_case; i++) {
			set.add(arr[i]);
		}
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		
		for(int val:list) {
			int c = 0;
			for(int i = 0; i<test_case; i++) {
				if(arr[i]==val) {
					c++;
				}
			}
			System.out.println(val+" aparece "+c+" vez(es)");
		}
	}

}
