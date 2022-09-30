import java.util.ArrayList;

public class listtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long> list1 = new ArrayList<Long>();
		list1.add((long) 10);
		list1.add((long) 100);
		list1.add((long) 1000);
		list1.add((long) 10000);
		list1.remove(0);
		System.out.println(list1.get(0));

	}

}
