
public class Exercise {

	public static void main(String[] args) {
		// Find the difference between smallest and highest value of a given array
		int[] array = {2,3,4,5,6,1,8,100};
		int max = array[0];
		int min = array[0];
		for(int i = 1; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];//2,3 here 3 is big so it will store in the max value
			}
			if(min>array[i]) {
				min = array[i];//2,1 here min = 1
			}
		}
		System.out.println(max-min);
		

	}

}
