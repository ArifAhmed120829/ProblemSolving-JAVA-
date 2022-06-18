import java.util.Scanner;

public class BEE_2060 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = in.nextInt();
		int[] L = new int[N];
		for(int i = 0; i<N; i++) {
			L[i] = in.nextInt();
		}
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		for(int i = 0; i<N; i++) {
			if(L[i]%2==0) two++;
			if(L[i]%3==0) three++;
			if(L[i]%4==0) four++;
			if(L[i]%5==0) five++;
		}
		System.out.println(two+" Multiplo(s) de 2");
		System.out.println(three+" Multiplo(s) de 3");
		System.out.println(four+" Multiplo(s) de 4");
		System.out.println(five+" Multiplo(s) de 5");

	}

}

/*
 * 5
2 5 4 20 10
*/
