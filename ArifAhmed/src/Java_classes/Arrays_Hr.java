package Java_classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Arrays_Hr {

	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(in.readLine().trim());
	        String result = "";
	        int x;
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        String[] line;
	        line = in.readLine().split(" ");
	        for(int i = 0; i<n; i++) {
	        	x = Integer.parseInt(line[i]);
	        	list.add(x);
	        }
	        ArrayList<Integer> list2 = new ArrayList<Integer>();
	        
	        for(int j = n-1; j>=0; j--) {
	        	list2.add(list.get(j));
	        }
	        for(int value: list2) {
	        	result = result + value + " ";
	        }
	        System.out.print(result.trim());
	        

	        in.close();
		
		

	}

}
