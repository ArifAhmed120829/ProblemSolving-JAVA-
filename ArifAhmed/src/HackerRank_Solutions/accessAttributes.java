package HackerRank_Solutions;

class aa{
	int x;// primitive data type
	aa var;
	aa(int d){
		x = d;
		
	}
}

public class accessAttributes {

	public static void main(String[] args) {
		aa a = new aa(5);
		aa b = new aa(6);
		a.var = b;
		System.out.println(a.var.x);
		

	}

}
