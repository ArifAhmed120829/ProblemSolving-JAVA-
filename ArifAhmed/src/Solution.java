
import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    static String isBalanced(String s) 
    {
    	String t = "true";
    	String h = "false";
    	int j = 1;
    	int p = 0;
    	int len = s.length();
    	int i =0;
    	while(i!=len) {
    		char bracket = s.charAt(i);
    		if(bracket=='{') {
    			while(true) {
    				if( s.charAt(j) != '}' ||  s.charAt(j+2)!= '}'  ) {
    					p++;	
    				}
    				else {
    					break;
    				}
    			}
    		}
    		else if(bracket=='(') {
    			while(true) {
    				if(bracket!= s.charAt(j) || bracket!= s.charAt(j+2) ) {
    					p++;
    				}
    				else {
    					break;
    				}
    			}
    		}
    		
    		i++;
    	}
    		
    	
		if(p!=0) return t;
		else return h;
    	
    	
    	

    }
    
}

class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}

