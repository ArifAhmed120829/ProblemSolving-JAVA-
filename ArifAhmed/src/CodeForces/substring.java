package codeforce;

import java.util.Scanner;
import java.util.*;

public class substring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i<t; i++) {
			
			String s = in.next();
			
			boolean b = true ;
			int p1 = 0;
			int p2 = s.length()-1;
			char p;
			char q ;
			char z ='(';
			char u =')';
			
			if(s.length()%2==0) {
				
				while(p1<=p2) {
					p=s.charAt(p1);
					q =s.charAt(p2);
					if(p != z && q !=u) {
						
						b = false;
						break;
					}
					
					
					p1++;
					p2--;
				}
			}
			else {
				b = false;
			}
		
			if(b == true) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
				Stack<Character> st = new Stack<Character>();
				char[] arr = s.toCharArray();
				int x,y,len;
				x = 0; y = 1; len = s.length();
				int c = 0;
				for(int j = 0; j<len; j++) {
					if(y>=len) {
						st.push('(');
						st.push(')');
						if(c>0) {
							for(int k = 0; k<c; k++) {
								st.push(')');
							}
						}
						break;
					}
					
					if(arr[x] == ')' && arr[y] ==')') {
						st.push('(');
						st.push(')');
						
					}
					else if(arr[x] ==')' && arr[y] == '(') {
						st.push('(');
						c++;
					}
					else if(arr[x] == '(' && arr[y] ==')') {
						st.push('(');
						st.push(')');
					}
					else if(arr[x] == '(' && arr[y] =='(') {
						st.push('(');
						st.push(')');
					}
					x++;
					y++;
					
				}
				String res = "";
				for(char val:st) {
					res = res + val;
				}
				System.out.println(res);
				
			}
		
			
			
		}

	}



}
