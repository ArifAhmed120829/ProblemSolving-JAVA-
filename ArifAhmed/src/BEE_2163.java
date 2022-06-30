import java.util.Scanner;

public class BEE_2163 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int row = in.nextInt();
		int col = in.nextInt();
		int q = 0;
		int w = 0;
		int e = 0;
		if(row>=3 && col<=1000) {
			int[][] row_col = new int[row][col];
			for(int i = 0; i<row; i++) {
				for(int j = 0;j<col;j++) {
					row_col[i][j] = in.nextInt();
				}
			}
			for(int i = 0; i<row; i++) {
				for(int j = 0;j<col;j++) {
					if(row_col[i][j]>= -100 &&row_col[i][j] <= 100) {
						if(row_col[i][j]==42) {
							if((i-1)>=0 &&(j-1)>=0 && (i+1)<row &&(j+1)<col) {
								if(row_col[i-1][j-1] == 7) {
									if(row_col[i-1][j] == 7) {
										if(row_col[i-1][j+1] == 7) {
											if(row_col[i][j-1] == 7) {
												if(row_col[i][j+1] == 7) {
													if(row_col[i+1][j-1] == 7) {
														if(row_col[i+1][j] == 7) {
															if(row_col[i+1][j+1] == 7) {
																w = i;
																e = j;
																q++;
																break;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			if(q==0) {
				System.out.println(w+" "+e);
			}
			else if(q==1) {
				System.out.println((w+1)+" "+(e+1));
			}
		}
	}

}
