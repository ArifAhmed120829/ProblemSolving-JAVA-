import java.util.Scanner;

public class BEE_1253 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int test_case = in.nextInt();
		for(int j = 0; j<test_case; j++) {
			//Letters: A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
		    //if number of right shift is 25 then Z = A;
		    //A->C,B->D,Y->A etc;
		    //A = 65, Z = 90;
		    //int test_case = in.nextInt();
		    /*
		    for(int i = 0; i<test_case; i++) {
		      String c_s = in.next();//c_s = codified sentence
		    }
		    */
		    String a =in.next();
		    int num = in.nextInt();
		    char[] g;
		    char[] d;
		    int[] g1;
		    int len = a.length();
		    g = new char[len];
		    d = new char[len];
		    g1 = new int[len];
		    g[0] = 0;
		    g1[0] = 0;
		    int x = 0;
		    for(int i = 0; i<len; i++) {
		    	 g[i] = a.charAt(i);
		    }	 
		    for(int i = 0; i<len; i++) {
		    	g1[i] = Integer.valueOf(g[i]);
		  	    if(g1[i]-num>64 && g1[i]-num<91) {
		  	    	x = g1[i]-num;
		  	    }
		  	    else {
		  	    	if(g1[i]-65<num) {
		  	    		x = g1[i]-65;
		  	    		x = num-x;
		  	    		x = 91-x;
		  	    	}
		  	    	
		  	    }
		  	    d[i] = Character.valueOf((char) x);
		    }
		    for(int i = 0; i<len; i++) {
		    	System.out.print(d[i]);
		    }
		    System.out.println();
		}
	}

}
