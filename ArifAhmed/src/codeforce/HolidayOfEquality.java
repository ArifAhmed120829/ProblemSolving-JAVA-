package com.example.demo;
import java.util.*;
public class HolidayOfEquality {

	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
		int n = in.nextInt();// the number of citizens in the kingdom.
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i =0; i<n; i++) {
			arr[i] = in.nextInt();
			if(arr[i]>max) max = arr[i];
		}
		int c = 0;
		
		for(int i =0; i<n; i++) {
			c = c+(max - arr[i]);
		}
		System.out.println(c);

	}

}
