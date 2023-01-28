package LeetCode_Solving;

import java.util.Stack;

//given array of characters
//return array of characters
class Solution {
    public void reverseString(char[] s) {
    	Stack<Character> st = new Stack();
    	String ans = new String(s);
    	for(int i = 0; i<s.length; i++) {
    		st.push(s[i]);
    	}
    	char[] ans2 = new char[s.length];
    	int j = 0;
    	while(st.size()>0) {
    		s[j++] = st.pop();
    	}
    		
    	
    	for(int x = 0; x<s.length; x++) {
    		ans2[x] = ans.charAt(x);
    	}
    	
    }
}
public class Rev_String {

	public static void main(String[] args) {
		char[] ho = new char[] {'a','c','d'};
		Solution it = new Solution();
		it.reverseString(ho);
		
	} 

}
