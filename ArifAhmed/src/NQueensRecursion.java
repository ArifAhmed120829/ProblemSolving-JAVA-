import java.util.Scanner;

public class NQueensRecursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

// sc.close();

		int[][] arr = new int[11][11];

		int pos = 0;

		if (n == 2 || n == 3) {

			System.out.println("Not possible");

		}

		boolean b = nqueen(arr, n, pos);

	}

	private static boolean nqueen(int[][] arr, int n, int i) {

		if (n == i) {

//Successfully place the queens in n row position

//Print the rows

			for (int j = 0; j < n; j++) {

				for (int k = 0; k < n; k++) {

					if (arr[j][k] == 0) {

						System.out.print("0 ");

					}

					else

						System.out.print("1 ");

				}

				System.out.print("\n");

			}

			return true;

		}

//Recursive Case

//Try to place the Queen in the Front row only rest will be handeled by the recursive leap of faith

		for (int j = 0; j < n; j++) {

//check if i,j position is safe to place the Queen or not

			if (isSafe(arr, i, j, n)) {

// System.out.println("***");

//Placing the Queen Assuming it is the Right Position

				arr[i][j] = 1;

				boolean nextQueenRakhPaRaheHai = nqueen(arr, n, i + 1);

				if (nextQueenRakhPaRaheHai) {

					return true;

				}

//If we came here it means that the next position is not filled,

//Our assumption is Wrong.

				arr[i][j] = 0;

			}

		}

//You have tried for all position in the current row but couldn't place a queen

		return false;

	}

	private static boolean isSafe(int[][] board, int i, int j, int n) {

		for (int row = 0; row < n; row++) {

			if (board[row][j] == 1) {

				return false;

			}

		}

//left Diagonal

		int x = i;

		int y = j;

		while (x >= 0 && y >= 0) {

			if (board[x][y] == 1) {

				return false;

			}

			x--;

			y--;

		}

//Right Diagonal

		x = i;

		y = j;

		while (x >= 0 && y < n) {

			if (board[x][y] == 1) {

				return false;

			}

			x--;

			y++;

		}

//Since we have checked the row And Columns

		return true;

	}

}
