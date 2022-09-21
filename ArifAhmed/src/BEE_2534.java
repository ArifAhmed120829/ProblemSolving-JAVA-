

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BEE_2534 {
	 static Scanner input = new Scanner(System.in);

  public static void main(String[] args) throws NumberFormatException, IOException {
	  while(input.hasNext()) {
		   
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    ArrayList<Integer> result_list = new ArrayList<Integer>();
		    
		    
		    int x = input.nextInt();
		    int y = input.nextInt();
		    for(int i = 0; i<x; i++) {
		      int l = input.nextInt();
		      list.add(l);
		    }
		    Collections.sort(list);
		    int s = list.size();
		    for(int i = 0; i<y; i++) {
		      int l2 = input.nextInt();
		      result_list.add(list.get(s-l2));
		    }
		    for(int value: result_list) {
		      System.out.println(value);
		    }
	  }
	
	  input.close();
    

  }

}
