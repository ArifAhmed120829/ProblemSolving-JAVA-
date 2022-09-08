package Java_classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class avoid{
	int age;
	public static final String res1 = "you are not old enough to vote.";
	public static final String res2 = "you are old enough to vote!";
	
	String pornhub() {
		if(age<=17) {
			return res1;
		}
		else {
			return res2;
		}
		
		
	}
}
class vote {
	String auth = "";
	int num;
	
	
}

public class helllololo {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		avoid me = new avoid();
		vote now = new vote();
		System.out.println("Please enter your age: ");
		try {
			me.age = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(me.pornhub());
		while(!me.pornhub().equals(me.res1)) {
			
		}

	}

}
