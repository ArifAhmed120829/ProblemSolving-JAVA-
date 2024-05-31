package codeforce;



import java.util.Scanner;

public class Prime_delete {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int i = 0; i<t; i++) {
    	int c = 0;
      String s = in.next();
      int b = Integer.parseInt(s);
      if(isPrime(b)) System.out.println(b);
      else {
    	  int len  = s.length();
          for(int j = 0; j<len; j++) {
        	  String newString = s.substring(j);
        	  for(int k = j+1; k<len;k++) {
        		  String newString2= removeCharAtIndex(newString, k);
        		  int a = Integer.parseInt(newString2);
        		  if(isPrime(a)) {
        			  System.out.println(a);
        			  c++;
        			  break;
        		  }
        		 
        	  }
        	  if(c!=0) break;
        	  
          }
          if(c==0) System.out.println(-1); 
      }
    
     
     
    }
    

  }
  // Function to remove a character at a specific index
  public static String removeCharAtIndex(String str, int index) {
      if (index < 0 || index >= str.length()) {
          // Index out of bounds
          return str;
      }
      
      return str.substring(0, index) + str.substring(index + 1);
  }
  public static boolean isPrime(int n)
  {
      // Corner case
      if (n <= 1)
          return false;
   
      // Check from 2 to n-1
      
      for (int i = 2; i <= n / 2; i++)
          if (n % i == 0)
              return false;
   
      return true;
  }

}
