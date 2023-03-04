package LeetCode_Solving;

public class SplitWithMinimumSum {

	public static void main(String[] args) {
		int num = 687;
		String string = String.valueOf(num);
		int len = string.length();
		char [] digit = string.toCharArray();
		int[] array = new int[len];
		for(int i = 0; i<len; i++) {
			array[i] = Integer.valueOf(String.valueOf(digit[i]));
			
		}
		int low = 0;
		int high = array.length - 1;
		quicksort(array,low,high);
		String a = "";
		String b = "";
		for(int i = 0; i<array.length; i=i+2) {
			a = a + String.valueOf(array[i]);
		}
		for(int i = 1; i<array.length; i=i+2) {
			b = b + String.valueOf(array[i]);
		}
		int sum = Integer.valueOf(a)+Integer.valueOf(b);
		System.out.println(sum);

	}

	private static void quicksort(int[] array, int low, int high) {
		if(low>=high) {
			return;
		}
		int pivot = array[high];
		int lp = low;
		int rp = high;
		while(lp<rp) {
			while(lp<rp && pivot >=array[lp]) {
				lp++;
			}
			while(lp<rp && pivot<=array[rp]) {
				rp--;
			}
			swap(array,lp,rp);
		}
		swap(array,lp,high);
		quicksort(array,low,lp-1);
		quicksort(array,lp+1,high);
		
	}

	private static void swap(int[] array, int l, int h) {
		int temp = array[l];
		array[l] = array[h];
		array[h] = temp;
		
	}

}
