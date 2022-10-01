package CodeForces;

import java.util.Scanner;

public class Glory_Addicts {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();// 4
		int[] type_of_skills;
		int[] initial_damage ;
		int sum;
		for (int i = 0; i < test_case; i++) {
			sum = 0;
			int number_of_skills = in.nextInt();// 4
			type_of_skills = new int[number_of_skills];
			initial_damage = new int[number_of_skills];
			for (int j = 0; j < number_of_skills; j++) {
				 type_of_skills[j] = in.nextInt();
			}
			for (int k = 0; k < number_of_skills; k++) {
				
				 initial_damage[k] = in.nextInt();
				 if(k+1<number_of_skills) {
					 if(type_of_skills[k] == type_of_skills[k+1]) initial_damage[k] = initial_damage[k] *2;
				 }
				
			}
			for (int k = 0; k < number_of_skills; k++) {
				 sum = sum + initial_damage[k];
				 
			}
			System.out.println(sum);
			
		}

	}

}
