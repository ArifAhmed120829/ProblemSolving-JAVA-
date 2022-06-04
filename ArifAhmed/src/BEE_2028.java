import java.util.Scanner;

public class BEE_2028 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int order = 1;
		while(in.hasNext()) {
			int n = in.nextInt();
			int j = 0;
			int sum = 1;
			
			if(n-1>=j) {
				order++;
				while(n>=j) {
					for(int i = 1; i<=j; i++) {
						sum++;
					}
					j++;
				}
				System.out.println("Caso "+order+": "+sum+" numeros");
				System.out.print(0+" ");
				j=0;
				while(n>=j) {
					for(int i = 1; i<=j; i++) {
						System.out.print(j+" ");
					}
					j++;
				}
				System.out.println();
				System.out.println();
			}
			else {
				System.out.println("Caso "+order+": "+sum+" numero");
				System.out.println(j);
				System.out.println();
			}
			
		}

	}

}
