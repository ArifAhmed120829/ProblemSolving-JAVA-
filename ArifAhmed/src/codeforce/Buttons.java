package codeforce;

import java.util.Scanner;

public class Buttons {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String f  = "First";
		String s  = "Second";
		int t = in.nextInt();
		for(int i = 0; i<t; i++) {
			int a,b,c;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			game(a,b,c,f,s);
			
		}

	}

	private static void game(int a, int b, int c, String f, String s) {
		while(a!=0 && c!=0 || b!=0 && c!=0) {
			if(a>0) a--;
			if(b>0) b--;
			if(a==0) {
				c--;
				if(a==0 && c==0) {
					System.out.println(f);
					return;
				}
			}
			if(b==0) {
				c--;
				if(b==0 && c==0) {
					System.out.println(s);
					return;
				}
			}
			
		}
		
		
	}





}
