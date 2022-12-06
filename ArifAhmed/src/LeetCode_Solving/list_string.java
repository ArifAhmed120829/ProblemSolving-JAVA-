package LeetCode_Solving;

import java.util.Stack;

public class list_string {

	public static void main(String[] args) {
		String ab ="ahmed";
		Stack<Character> st = new Stack();
		for(char value:ab.toCharArray()) {
			st.push(value);
		}
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		System.out.println(st.peek());
		
	}

}
