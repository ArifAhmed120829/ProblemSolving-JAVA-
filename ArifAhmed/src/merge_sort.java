
public class merge_sort {

	public static void main(String[] args) {
		int[] array = {10,5,7,11,9,8,6};
		int[] helper = new int[array.length];
		ms(array,helper,0,array.length-1);
		for(int val: array) {
			System.out.println(val);
		}
		

	}

	private static void ms(int[] array,int[] helper,int low, int high) {
		if(low<high) {
			int mid = (low + high)/2;
			ms(array,helper,low,mid);
			ms(array,helper,mid+1,high);
			merge(array,helper,low,mid,high);
		}
	}

	private static void merge(int[] array, int[] helper, int low, int mid, int high) {
		for(int i = 0; i<array.length; i++) {
			helper[i] = array[i];
		}
		int helperleft = low;
		int helperright = mid+1;
		int current = low;
		
		while(helperleft<=mid && helperright<= high) {
			if(helper[helperleft]<=helper[helperright]) {
				array[current] = helper[helperleft];
				helperleft++;
			}
			else {
				array[current] = helper[helperright];
				helperright++;
			}
			current++;
		}
		int remaining = mid - helperleft;// jodi minus hoi taile bujhba laster ta boro already
		for(int i = 0; i<=remaining; i++) {//0-3 mane 4 ta baki ase
			array[current+i] = helper[helperleft+i];
		}
		
	}
	

}
