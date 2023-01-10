import java.util.ArrayList;
import java.util.Scanner;

public class BEE_2547 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int number_of_guest = in.nextInt();
			int min_height = in.nextInt();
			int max_height = in.nextInt();
			for(int i = 0; i<number_of_guest; i++ ) {
				int height = in.nextInt();
				list.add(height);
			}
			System.out.println(qualified_guest(list,min_height,max_height));
		}

	}

	private static int qualified_guest(ArrayList<Integer> list, int min_height, int max_height) {
		int  j = 0;
		for(int x = 0; x<list.size(); x++) {
			if(list.get(x)<=max_height && list.get(x)>=min_height) j++;
		}
		return j;
	}

}
