package codeforce;
import java.util.*;

public class horseshoe {

	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	
		
		for(int i = 0; i<4; i++) {
			a = in.nextInt();
			if(!map.containsValue(a)) {
				map.put(i, a);
			}
		}
		int res = 4 - map.size();
		System.out.println(res);

	}

}
