package HackerRank_Solutions;

import java.util.Scanner;


class Arithmetic {
	public int method1(int[] arr) {
		int len = arr.length;
		int sum = 0;
		for(int i = 0; i<len; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public String method2(String[] arr) {
		int len = arr.length;
		String s2 = "";
		for(int i = 0; i<len; i++) {
			s2 = s2 + arr[i];
		}
		return s2;
	}
	
    
}

public class Java_Basic {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		Arithmetic ob = new Arithmetic();
		String s=in.nextLine();//1 2 3 4 5
		String[] parts = s.split(" ");//1,2,3,4,5
		try {
			
			int[] numbers = new int[parts.length];
			for (int i = 0; i < parts.length; i++) {
				  numbers[i] = Integer.parseInt(parts[i]);
				}
			System.out.println(ob.method1(numbers));
			}
			catch(Exception e) {
				String[] s1 = new String[parts.length];
				for (int i = 0; i < parts.length; i++) {
					  s1[i] = parts[i];
					}
				System.out.println(ob.method2(s1));
				
			}
		int x = 010;
		int y = 07;
		System.out.println(x);
		System.out.println(y);
		try {
			Float f1 = new Float("3.0");
			int v = f1.intValue();
			byte b = f1.byteValue();
			double d = f1.doubleValue();
			System.out.println(v+b+d);
		}
		catch(Exception e) {
			System.out.println("hoga");
			
		}
		
		

	}

}
