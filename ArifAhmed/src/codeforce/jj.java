package codeforce;
import java.util.*;
public class jj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			int a_len = in.nextInt();
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			int[] a = new int[a_len];
			for(int j = 0; j<a_len; j++) {
				a[j] = in.nextInt();
			}
			
			for(int x = 0; x<a_len; x++) {
				if(x+1<a_len) {
					if(a[x]%a[x+1] != 0) {
						list1.add(a[x]);
						list2.add(a[x+1]);
						x++;
					}
				}
				else list1.add(a[x]);
				
			}
			
			if(list1.size() <=0 || list2.size() <=0) {
				System.out.println(-1);
			}
			else {
				System.out.println(list1.size()+" "+list2.size());
				for(int val:list1) System.out.print(val+" ");
				System.out.println();
				for(int val:list2) System.out.print(val+" ");
			}
			
			
		}

	}

}
