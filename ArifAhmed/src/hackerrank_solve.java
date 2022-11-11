import java.util.ArrayList;
import java.util.Scanner;

class Arithmetic{
	public int sum(int[] arr1) {
		int len = arr1.length;
		int sum = 0;
		for(int i = 0; i<len; i++) {
			sum = sum + arr1[i];
		}
		return sum;
	}
	public String sum2(String[] arr2) {
		  String res = ""; 
		  for(int i = 0; i<arr2.length; i++) {
			  res = res + arr2[i];
			}
		  return res;
	}
}
public class hackerrank_solve {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		Arithmetic obj = new Arithmetic();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String str2 = "";
		String[] str_arr;
		int[] arr;
		int j = 0;
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ') {
            	//arr[j] = Integer.parseInt(str2);
            	if (str2.chars().allMatch( Character::isDigit )) {
            		list.add(Integer.parseInt(str2));
            		k++;
            	}
            	else {
            		list2.add(str2);
            	}
            	
            	str2 = "";
            	j++;
            }
            else {
            	str2 = str2+str.charAt(i);
            	if(i+1==str.length()) {
            		if (str2.chars().allMatch( Character::isDigit )) {
                		list.add(Integer.parseInt(str2));
                		k++;
                	}
            		else {
            			list2.add(str2);
            		}
            		j++;
            	}
            }
                
        }
		int x = 0;
		if (k==0)
		{
			str_arr = new String[j];
			for(String value: list2) {
				str_arr[x] = value;
				x++;
			}
			System.out.println(obj.sum2(str_arr));
		}
		else {
			arr = new int[j];
			for(int value: list) {
				arr[x] = value;
				x++;
			}
			System.out.println(obj.sum(arr));
		}

	}

}
