import java.text.DecimalFormat;

public class praactiehoga {
	DecimalFormat df = new DecimalFormat("0.0");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1000,200,30,5,40,4,100,45,10};
		//10<20,20<30,5<30,30<40,4<40,40<100,45<100,10<100;
		int i  = 1;
		int k  = 0;
		
		int max = arr[0];
		
		while(i!=arr.length) {
			if(max>arr[i]) {
				
			}
			else {
				max = arr[i];
				k = i;
			}
			i++;
		}
		System.out.println(max);
		System.out.println(k);
		int p = 169194;
		int j = (int) Math.sqrt(p);
		System.out.println(j);
		
	}

}
