
public class coc {
	static int count = 0;
	public coc() {
		count += 1;
		System.out.println(count+" ");
	}

	public static void main(String[] args) {
		coc c = new coc();
		coc c1 = new coc();
		coc c2 = new coc();

	}

}
