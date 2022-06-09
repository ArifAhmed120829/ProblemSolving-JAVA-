import java.util.Scanner;

public class BEE_1847 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int temp1 = in.nextInt();
		int temp2 = in.nextInt();
		int temp3 = in.nextInt();
		if(temp1>temp2 & temp3>=temp2) {
			System.out.println(":)");
		}
		else if(temp1<temp2 & temp3<=temp2) {
			System.out.println(":(");
		}
		else if(temp1<temp2 & temp3>temp2) {
			if((temp2-temp1)>(temp3-temp2)) {
				System.out.println(":(");
			}
			else if((temp2-temp1)<=(temp3-temp2)) {
				System.out.println(":)");
			}
		}
		else if((temp1>temp2) & (temp3<temp2)) {
			if((temp2-temp3)<(temp1-temp2)) {
				System.out.println(":)");
			}
			else if((temp2-temp3)>=(temp1-temp2)) {
				System.out.println(":(");
			}
		}
		else if((temp1==temp2)) {
			 if(temp3>temp2) {
					System.out.println(":)");
				}
			 else {
				 System.out.println(":(");
			 }
			
		}
		

	}

}
