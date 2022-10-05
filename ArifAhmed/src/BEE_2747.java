
public class BEE_2747 {

	public static void main(String[] args) {
		int dashes = 39;
		for (int i = 0; i < dashes; i++) {
			System.out.print("-");
		}
		int y = 5;
		System.out.println();
		while(y!=0) {
			
			for(int j = 0; j<dashes; j++) {
				if(j==0) {
					System.out.print("|");
				}
				else if(j==(dashes-1)) {
					System.out.println("|");
				}
				else {
					System.out.print(" ");
				}
			}
			y--;
		}
		for (int i = 0; i < dashes; i++) {
			System.out.print("-");
		}
		System.out.println();
	

	}

}
