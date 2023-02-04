package CodeForces;

import java.util.Scanner;

public class contest2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for (int i = 0; i < test_case; i++) {
			int len = in.nextInt();// UUURDDL
			String str = in.next();
			int[][] arr = new int[7][7];
			int x = 0;
			int y = 0;
			int j = 0;
			while (j < len) {
				if (str.charAt(j) == 'U') {
					if(x <0 || y<0) {
						y++;
					}
					else {
						arr[x][++y] = 1;
					}
				
				

				} else if (str.charAt(j) == 'D') {
					if(y<=0) {
						y--;
					}
					else {
						arr[x][--y] = 1;
					}
					
					

				} else if (str.charAt(j) == 'L') {
					if(x<=0) {
						x--;
					}
					else {
						arr[--x][y] = 1;
					}
					

				} else if (str.charAt(j) == 'R') {
					if(x <0 || y<0) {
						x++;
					}
					else {
						arr[++x][y] = 1;
					}
					
					

				}

				j++;
			}
			if(arr[1][1]==0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			

		}

	}

}
