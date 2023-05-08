
import java.util.*; 
import java.io.*;

class palindromeee {

  public static String LetterCapitalize(String str) {
    // code goes here
    int len = str.length()  ;
    int i = 0;
    String s = "";
    while(i<len){
      if(str.charAt(i) ==' '){
    	  s = s + str.charAt(i);
    	  char c =  Character.toUpperCase(str.charAt(i+1));
    	  s = s + c;
    	  i = i +2;
        
      }
      else if(i == 0) {
    	  char c =  Character.toUpperCase(str.charAt(i));
    	  s = s+c;
    	  i++;
    	
    	  
      }
      else {
    	  s = s + str.charAt(i);
          i++;
      }
    }
    return s;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }

}
