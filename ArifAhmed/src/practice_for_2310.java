import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class practice_for_2310 {
	static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		HashMap<Character,Integer> letters =  new HashMap<Character,Integer>();
		int value = 0;
		int listx = 0;
		int listx2 = 100;
		for(char i = 'A'; i<='Z';i++) {
			letters.put(i, value);
			value++;
		}
		System.out.println(letters);
		//ArrayList<Integer> lists = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> full_lists = new ArrayList<ArrayList<Integer>>();
		for(int x = 0; x<5; x++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(listx);
			list.add(listx2);
			full_lists.add(list);
			listx2++;
			listx++;
		}
		System.out.println(full_lists);
		
		
		
	}

}
