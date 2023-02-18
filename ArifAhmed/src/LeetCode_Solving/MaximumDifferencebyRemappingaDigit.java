package LeetCode_Solving;

import java.util.Stack;

public class MaximumDifferencebyRemappingaDigit {

	public static void main(String[] args) {
		int num = 90;
		String str = String.valueOf(num);
		Stack<Character> st = new Stack<Character>();
		for(int j = 0; j<str.length(); j++) {
			st.add(str.charAt(j));
		}
		max(st);
		min(st);
		String res1 = "";
		String res2 = "";
		for(char c:max(st)) {
			res1 = res1+c;
		}
		for(char c:min(st)) {
			res2 = res2+c;
		}
		int int_res1 = Integer.valueOf(res1);
		int int_res2 = Integer.valueOf(res2);
		System.out.println(int_res1-int_res2);
		

	}

	private static Stack<Character> min(Stack<Character> st) {
		Stack<Character> mn = new Stack<Character>();
		for(char c:st) {
			mn.add(c);
		}
		int num1 = Character.getNumericValue(mn.get(0));
		if(num1>0) mn.set(0, '0');
		for(int z = 1; z<mn.size();z++) {
			if(num1==Character.getNumericValue(mn.get(z))) {
				mn.set(z, '0');
			}
			
		}
		return mn;
		
	}

	private static Stack<Character> max(Stack<Character> st) {
		Stack<Character> mx = new Stack<Character>();
		for(char c:st) {
			mx.add(c);
		}
		int b = 0;
		while(b<st.size()) {
			if( Character.getNumericValue(mx.get(b))==9) {
				b++;
			}
			else {
				break;
			}
		}
		if(b!=st.size()) {
			int num1 = Character.getNumericValue(mx.get(b));
			if(num1<9) mx.set(b, '9');
			for(int z = b+1; z<mx.size();z++) {
				if(num1==Character.getNumericValue(mx.get(z))) {
					mx.set(z, '9');
				}
				
			}
		}
		
		return mx;
		
		
	}

}
