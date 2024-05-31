package codeforce;

import java.util.*;

public class c1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int chest = in.nextInt();
			int key = in.nextInt();
			int time = in.nextInt();
			int res = 0;
			// key and chest which is bigger
			if (key > chest) {
				if (key - chest > time) {
					res = chest + time;
					int temp =res;
					res = res + (key - res);
					res = res + (res-temp);
				}
				else {
					res = chest + (key-chest);
				}
				

			}
			else if(chest > key) {
				res  = key + (chest - key);
			}
			else {
				res = res + chest;
			}
			System.out.println(res);
		}
	}

}
