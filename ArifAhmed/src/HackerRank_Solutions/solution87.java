package HackerRank_Solutions;

class why{
	int data;
	why w;
	
	why(int d){
		data = d;
	}
	
}

public class solution87 {

	public static void main(String[] args) {
		why ref = new why(5);
		why ref2 = new why(6);
		ref.w = ref2;
		System.out.println(ref.data);
		System.out.println(ref.w.data);
	}

}
