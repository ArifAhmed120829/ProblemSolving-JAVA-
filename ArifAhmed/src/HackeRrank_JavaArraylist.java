import java.util.ArrayList;
import java.util.Scanner;

public class HackeRrank_JavaArraylist {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> full_lists = new ArrayList<ArrayList<Integer>>();
		int Line = in.nextInt();//5
		for(int i = 1; i<=Line; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int number_of_int = in.nextInt();//5
			for(int j = 0; j<number_of_int; j++) {
				int number = in.nextInt();
				list.add(number);
			}
			full_lists.add(list);
		}
		int queries = in.nextInt();
		for(int i = 0; i<queries; i++) {
			int x = in.nextInt();//1
			int y = in.nextInt();//3
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			list2.addAll(full_lists.get(x-1));
			int size = list2.size();
			if(y<=size){
				System.out.println(list2.get(y-1));
			}
			else {
				System.out.println("ERROR!");
			}
		}

	}

}
