import java.util.*;
public class Dictionaries_and_Maps {

	public static void main(String[] args) {
		//Complete this code or write your own from scratch
		        Scanner in = new Scanner(System.in);
		        HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
		        int n = in.nextInt();//3
		        for(int i = 0; i < n; i++){
		            String name = in.next();//Sam
		            int phone = in.nextInt();//01554
		            // Write code here
		            
		            phonebook.put(name, phone);
		        }
		        while(in.hasNext()){
		            String s = in.next();
		            // Write code here
		            for(java.util.Map.Entry<String, Integer> entry: phonebook.entrySet()) {

		                if(entry.getKey() .equals(s)  ) {
		                  System.out.println( entry.getKey()+"="+entry.getValue());
		                }
		               
		              }
		        }
		        in.close();
		    
		
		

	}

}
