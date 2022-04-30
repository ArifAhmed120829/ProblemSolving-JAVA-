import java.util.*;
public class Missing_value {
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
   int total_num;
   int total_num2;
   int[] numbers = new int[]{1,2,3,4,6,7};
   total_num = 7;
   int expected_num_sum = total_num * ((total_num + 1) / 2);
   int num_sum = 0;
   for (int i: numbers) {
    num_sum += i;
    
   }
       System.out.print( expected_num_sum - num_sum);//28-23
	   System.out.print("\n");
	   int[] numbers2;
	   numbers2 = new int[5];
	   /*for(int i = 0; i< 4; i++) {
		   numbers2[i] = in.nextInt();
	   }
	   */
	   for(int i = 0; i<4; i++) {
		   total_num2 = numbers2.length;
		   System.out.println(total_num2);
	   }
	   
 }
}
 