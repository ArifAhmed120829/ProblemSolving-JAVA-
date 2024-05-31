package CodeForces;


import java.util.Scanner;

public class Make_it_Beautiful {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();//1
		for(int i = 0; i<t; i++) {
			int f_line = in.nextInt();//4
			int[] arr = new int[f_line];//arr[4]
			int[] f = new int[f_line];//f[4]
			f[0] = 0;//f[0] = 0
			for(int j = 0; j<f_line; j++) {// 0<4 -> 0,1,2,3
				int s_line = in.nextInt();
				arr[j] = s_line;// arr[0] = 3, arr[1] = 3,arr[2] = 6, arr[3] = 9
			}
			int x = 0;
			int y = 0;
			
			for(int j = 0; j<f_line; j++) {// 0<4 -> 0,1,2,3
				if(arr[j]!= f[x]) {// 3 != 0,3 == 3
					x++;//1
					if(x<f_line) {
						f[x] = f[j] + arr[j];// f[1] = 0 + 3
					}
					
				}
				else {
					
					method(arr,f,j);
				}
				
			}
			if(arr.length==2 && arr[0]==arr[1]) {
				System.out.print("NO");
			}
			
			else {
				System.out.println("YES");
				for(int val: arr) {
					System.out.print(val);
					if(y+1!=arr.length) {
						System.out.print(" ");
						y++;
					}
					
				}
			}
			System.out.println();
			
			
		}
		

	}

	private static int[] method(int[] arr, int[] f,int g) {
		int swap = arr[g];
		if(g+1<arr.length) {//g =1 -> arr[2] = 6 -> arr[1] = 3
			arr[g] = arr[g+1];// arr[1] = arr[2] -> arr[1] = 6
			arr[g+1] = swap;//arr[2] = previous value of arr[1]
		}
		else {
			arr[g] = arr[g-1];
			arr[g-1] = swap;
		}
		return arr;
		
	}



}
