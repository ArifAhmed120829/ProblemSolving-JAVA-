package LeetCode_Solving;

import java.util.Scanner;

public class Mergesortedarray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = 0;
		int n = 1;
		int[] arr = new int[m + n];
		int[] arr2 = new int[n];
		for (int i = 0; i < m; i++) {
			arr[i] = in.nextInt();
		}
		for (int j = 0; j < n; j++) {
			arr2[j] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arr[m + i] = arr2[i];
		}

		qsss(arr, 0, arr.length - 1);
		printarr(arr);
	}

	private static void printarr(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}

	}

	private static void qsss(int[] arr, int low, int high) {
		if (low > high) {
			return;
		}
		int pivot = arr[high];
		int lp = low;
		int rp = high;

		while (lp < rp) {
			while (pivot >= arr[lp] && lp < rp) {
				lp++;
			}
			while (pivot <= arr[rp] && lp < rp) {
				rp--;
			}
			swap(arr, lp, rp);
		}
		swap(arr, lp, high);
		qsss(arr, low, lp - 1);
		qsss(arr, lp + 1, high);

	}

	private static void swap(int[] arr, int lp, int rp) {
		int temp = arr[lp];
		arr[lp] = arr[rp];
		arr[rp] = temp;

	}

}
