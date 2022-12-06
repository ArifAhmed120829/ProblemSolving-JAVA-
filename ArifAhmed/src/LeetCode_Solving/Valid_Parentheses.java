package LeetCode_Solving;

import java.util.Stack;

class Validation {
    public boolean isValid(String s) {
    	if(s.length()%2!=0) return false;
    	Stack<Character> st = new Stack();
    	
    	for(char value:s.toCharArray()) {
			if(value=='(' || value=='{' || value=='[') {
				st.push(value);
			}
			else if(value==')' && !st.isEmpty() && st.peek()=='(') {
				st.pop();
			}
			else if(value=='}' && !st.isEmpty() && st.peek()=='{') {
				st.pop();
			}
			else if(value==']' && !st.isEmpty() && st.peek()=='[') {
				st.pop();
			}
			else {
				st.push(value);
			}
		}
    	return st.isEmpty();
    	
    	
    }
}

public class Valid_Parentheses {

	public static void main(String[] args) {
		String ab = "([}}])";
		Validation obj = new Validation();
		System.out.println(obj.isValid(ab));

	}
	//a ab = "()[]{}"
	// len = 6; ch = 0-5; for i = 0,2,4
	//for j = i+1

}
