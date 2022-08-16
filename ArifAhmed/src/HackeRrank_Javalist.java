import java.util.ArrayList;
import java.util.Scanner;

public class HackeRrank_Javalist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int numbers_of_integer = in.nextInt();
		for(int i = 0; i<numbers_of_integer;i++) {
			int number = in.nextInt();
			list.add(number);
		}
		int number_of_queries = in.nextInt();
		for(int i  =0; i<number_of_queries; i++) {
			String first_line = in.next();
			if(first_line.equals("Insert")) {
				int x = in.nextInt();
				int y = in.nextInt();
				list.add(x,y);
			}
			else if(first_line.equals("Delete")) {
				int x = in.nextInt();
				list.remove(x);
			}
		}
		for(int j : list) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		
		

	}

}
