package HackerRank_Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class go{
	public int filledOrders(List<Integer> order, int k) {
		int r = 0;
		int len  = order.size();
		for(int j = 0; j<len; j++) {
			if(k>= order.get(j)) r++;
		}
		return r;

	    }
}

public class Order {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		go ob = new go();
		int order = in.nextInt();//2
		ArrayList<Integer> list = new ArrayList<Integer>();
		int x;
		for(int i = 0; i<order; i++) {
			x =  in.nextInt();
			list.add(x);
		}
		int k = in.nextInt();
		
		System.out.println(ob.filledOrders(list, k));
		

	}

}
