import java.util.Scanner;

public class BEE_1179 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[15];
		int even = 0;
		int odd = 0;
		int max_even = 0;
		int max_odd = 0;
		int[] even_arr;
		int[] odd_arr;
		int j = 0;
		for(int i = 0; i<15; i++) {
			numbers[i] = in.nextInt();
			if(j<5) {
				if(numbers[i]%2==0) {
					max_even++;
				}
				else {
					max_odd++;
				}
				j++;
			}
		}
		for(int i = 0; i<15; i++) {
			if(numbers[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		int imposter1 = 0;
		int imposter2 = 0;
		even_arr = new int[even];
		odd_arr = new int[odd];
		for(int i = 0; i<15; i++) {
			if(numbers[i]%2==0) {
				even_arr[imposter1] = numbers[i];
				imposter1++;
			}
			else {
				odd_arr[imposter2] = numbers[i];
				imposter2++;
			}
		}
		int res1 = even -5;
		int res2 = odd - 5;
		int last_even = 0;
		int last_odd = 0;
		int count1 = 0;
		int count2 = 0;
		if(max_even>max_odd) {
			while(even>0 && even > res1) {
				System.out.println("par["+count1+"] = "+even_arr[count1]);
				count1++;
				even--;
			}
			while(odd>0 && odd > res2) {
				System.out.println("impar["+count2+"] = "+odd_arr[count2]);
				count2++;
				odd--;
			}
		}
		else if(max_even<max_odd) {
			while(odd>0 && odd > res2) {
				System.out.println("impar["+count2+"] = "+odd_arr[count2]);
				count2++;
				odd--;
			}
			while(even>0 && even > res1) {
				System.out.println("par["+count1+"] = "+even_arr[count1]);
				count1++;
				even--;
			}
			
		}
		while(odd>0 ) {
			if(count2<5) {
				System.out.println("impar["+count2+"] = "+odd_arr[count2]);
			}
			else if(count2>=5 && last_odd<5) {
				System.out.println("impar["+last_odd+"] = "+odd_arr[count2]);
				last_odd++;
			}
			else if(last_odd==5) {
				last_odd = 0;
				System.out.println("impar["+last_odd+"] = "+odd_arr[count2]);
				last_odd++;
			}
			count2++;
			odd--;
		
		}
		while(even>0 ) {
			if(count1<5) {
				System.out.println("par["+count1+"] = "+even_arr[count1]);
			}
			else if(count1>=5 && last_even<5) {
				System.out.println("par["+last_even+"] = "+even_arr[count1]);
				last_even++;
			}
			else if(last_even==5) {
				last_even = 0;
				System.out.println("par["+last_even+"] = "+even_arr[count1]);
				last_even++;
			}
			
			count1++;
			even--;
		}

	}

}
