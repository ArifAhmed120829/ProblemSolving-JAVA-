import java.util.Scanner;

public class BEE_1212 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
  Scanner in = new Scanner(System.in);
  for(;;) {
    String x = in.next();//545655//6
    String y= in.next();//55578//5
    if(x.equals("0") && y.equals("0")) break;
    int len1 = x.length();
    int len2 = y.length();
    int carry = 0;
    int real_carry = 0;
    while(len1-1>=0 && len2-1>=0) {
      
      char l = x.charAt(len1-1);
      char l2 = y.charAt(len2-1);
      int num = Character.getNumericValue(l);
      int num2 = Character.getNumericValue(l2);
      int sum = num + num2;
      if(sum>9) {
        real_carry++;
        carry++;
        //System.out.println("first"+sum);
      }
      else if(real_carry>0) {
        if(sum + 1>9) {
          carry++;
          //System.out.println("sec"+sum+1);
          real_carry = 0;
        }
        else {
          real_carry = 0;
        }
      }
       
      
      len1--;
      len2--;

    }
    if(real_carry>0) {
      if(x.length()!=y.length()) {
        if(x.length()>y.length()) {
          int index = x.length()-y.length();
          index = index -1;
          while(index!=-1) {
            char g =x.charAt(index);
            int num3 = Character.getNumericValue(g);
            if(num3+1>9 && real_carry>0) {
              carry++;
            }
            else {
              real_carry = 0;
            }
            index = index -1;
          }
        }
        else {
          int index = y.length()-x.length();
          index = index -1;
          while(index!=-1) {
            char g =y.charAt(index);
            int num3 = Character.getNumericValue(g);
            if(num3+1>9 && real_carry>0) {
              carry++;
            }
            else {
              real_carry = 0;
            }
            index = index -1;
          }
        }
      }
    }
    if(carry==0) {
      System.out.println("No carry operation.");
    }
    else if(carry==1) {
      System.out.println(carry+" carry operation.");
    }
    else {
      System.out.println(carry+" carry operations.");
    }
      
    
    
    
    
  }

	}

}
