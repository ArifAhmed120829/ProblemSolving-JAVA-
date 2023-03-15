
public class binarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int low = 0;
		int high = arr.length-1;
		int x = 7;
		System.out.println("find the value 6 in the given array");
		System.out.println(binary(x,low,high,arr));
		
		

	}

	private static int binary(int x, int low, int high, int[] arr) {
		int mid ; 
		while(low<=high) {
			mid= (low + high)/2;
			if(arr[mid]<x) {
				low = mid + 1;
				
			}
			else if(arr[mid]>x) {
				high = mid - 1;
				
			}
			else {
				return mid;
			}
		}
		return -1;
		
		
	}

}
