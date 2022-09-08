package Java_classes;

public class practicefff {

	public static void main(String[] args) {
		int row = 3;
		int col = 2;
		double[][] arr = new double[row][col];
		arr[0][0] = 4;
		arr[0][1] = 8;
		double res1 = arr[0][0];
		double res2 = arr[0][1];
		arr[1][0] = 15;
		arr[1][1] = 30;
		double res3 = arr[1][0];
		double res4 = arr[1][1];
		double r1 = res1/res2;
		double r2 = res4/res3;
		if(r1*r2==1) System.out.println("hi");
		System.out.println(r1*r2);
		System.out.println(r2);

	}

}
