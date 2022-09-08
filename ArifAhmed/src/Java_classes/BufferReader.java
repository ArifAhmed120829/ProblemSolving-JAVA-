package Java_classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number: ");
		try {
			int a = Integer.parseInt(in.readLine());
			System.out.println(a);
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("This not an integer bro!");
		}
		
		

	}

}
