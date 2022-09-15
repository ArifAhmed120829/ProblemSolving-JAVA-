
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class baajawd {
	static int plus(int a, int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
	}
	static int multi(int a, int b) {
		return a*b;
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] space;
		String result;
		String[] final_result;
		String key = "" ;
		while((key = in.readLine()) != null)
		{
			int failure_numbers = 0;
			String output = "";
			int total_numbers = Integer.valueOf(key);
			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<String> list2 = new ArrayList<String>();
			ArrayList<String> list3 = new ArrayList<String>();
			total_numbers = total_numbers * 2;
			final_result = new String[total_numbers];
			for(int i = 0; i<total_numbers; i++) {
				space = in.readLine().split(" ");//8 4=5
				String z = "";
				result = "";
				char y;
				int y2;
				if(total_numbers/2>i) {
					int x1 = Integer.parseInt(space[0]);
					 y = space[1].charAt(0);
					 y2= Character.getNumericValue(y);
					 // This is where + operation will held x1 + y2 = 1+3 = (ans);
					 list.add(x1);
					//char equal = space[1].charAt(1);
					list.add(y2);
					if(space[1].length()==4) {
						z = space[1].charAt(2)+z+space[1].charAt(3);//z = -1;
					}
					else {
						z =  z +space[1].charAt(2);// z = 7;
					}
					list2.add(z);
				}
				else {
					String name = space[0];//Abner
					int choosen_index = Integer.parseInt(space[1]);//3
					int real_index = choosen_index-1;
					char choosen_expression = space[2].charAt(0);// +
					int simple_calculation = (choosen_index+(choosen_index-1));
					int last_get = list.get(simple_calculation);
					int first_get = list.get(simple_calculation-1);
					String z_get = list2.get(real_index);
					if(choosen_expression=='+') {
						 result = plus(first_get,last_get)+"";
					}
					else if(choosen_expression=='-') {
						result = minus(first_get,last_get)+"";
					}
                    else if(choosen_expression=='*') {
                    	result = multi(first_get,last_get)+"";
					}
                    else if(choosen_expression=='I') {
                    	result = plus(first_get,last_get)+"";
                    	if(result.equals(z_get)) {
                    		 final_result[failure_numbers] = name;
    						 failure_numbers++;
    						 result = "";
                    	}
                    	result = minus(first_get,last_get)+"";
                    	if(result.equals(z_get)) {
                   		 final_result[failure_numbers] = name;
   						 failure_numbers++;
   						 result = "";
                    	}
                    	result = multi(first_get,last_get)+"";
                    	if(result.equals(z_get)) {
                      		 final_result[failure_numbers] = name;
      						 failure_numbers++;
      						 result = "";
      						 }
                    	
					}
					
					 if(choosen_expression!='I' && !result.equals(z_get)) {
						 final_result[failure_numbers] = name;
						 failure_numbers++;
					 }
					 
					
				}
				
				
			}
			if(failure_numbers==total_numbers/2) {
				System.out.println("None Shall Pass!");
			}
			else if(failure_numbers== 0) {
				System.out.println("You Shall All Pass!");
			}
			else if(failure_numbers<total_numbers/2 && failure_numbers>0) {
				for(int n = 0; n<failure_numbers; n++) {
					list3.add(final_result[n]);
				}
			}
		   //new line
			Collections.sort(list3);
			for(String str: list3) output = output + str+ " ";
			System.out.print(output.trim());
			System.out.println();
			
			
		}
		in.close();

	}

}

