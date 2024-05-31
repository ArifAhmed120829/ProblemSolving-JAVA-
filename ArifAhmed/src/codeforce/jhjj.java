package codeforce;

public class jhjj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "()()";
		char p=s.charAt(0);
		char q =s.charAt(1);
		char k ='(';
		char j =')';
		if(p != j && q != k) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
			System.out.println(s.charAt(0));
			System.out.println(s.charAt(1));
		}

	}

}
