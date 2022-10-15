
public class BEE_2748 {

	public static void main(String[] args) {
		int dashes = 39;
		String one = "Roberto";
		String two = "5786";
		String three = "UNIFEI";
		int j = 0;
		for(int i = 0; i<dashes; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 0; i<dashes; i++) {
			if(i==0||i==38) {
				System.out.print("|");
			}
			else if(i>=9 && i<=15) {
				System.out.print(one.charAt(j));
				j++;
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		for(int i = 0; i<dashes; i++) {
			if(i==0||i==38) {
				System.out.print("|");
			}
			
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		j = 0;
		for(int i = 0; i<dashes; i++) {
			if(i==0||i==38) {
				System.out.print("|");
			}
			else if(i>=9 && i<=12) {
				System.out.print(two.charAt(j));
				j++;
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		for(int i = 0; i<dashes; i++) {
			if(i==0||i==38) {
				System.out.print("|");
			}
			
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		j = 0;
		for(int i = 0; i<dashes; i++) {
			if(i==0||i==38) {
				System.out.print("|");
			}
			else if(i>=9 && i<=14) {
				System.out.print(three.charAt(j));
				j++;
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		for(int i = 0; i<dashes; i++) {
			System.out.print("-");
		}
		System.out.println();

	}

}
