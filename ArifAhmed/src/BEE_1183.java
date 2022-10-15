

import java.io.IOException;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_1183 {
  static DecimalFormat df = new DecimalFormat("0.0");


  public static void main(String[] args) throws IOException {
	  Scanner in = new Scanner(System.in);
	  //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  double sum = 0;
	  double avg = 0;
	  double ans;
	  String characte = in.next();
	  char character = characte.charAt(0);
	  double[][] arr = new double[12][12];
	  for(int i = 0; i<3; i++) {
	    for(int j = 0; j<3; j++) {
	      arr[i][j] = in.nextDouble();
	    }
	  }
	  if(character == 'S') {
	    for(int i = 0; i<12; i++) {
	      for(int j = 0; j<12; j++) {
	        if(i<j) {
	          sum = sum + arr[i][j];
	        }
	      }
	    }
	    System.out.println(sum);
	    
	  }
	  else if(character == 'M') {
	    for(int i = 0; i<12; i++) {
	      for(int j = 0; j<12; j++) {
	        if(i<j) {
	          sum = sum + arr[i][j];
	          avg++;
	        }
	      }
	    }
	    ans = (double) sum / avg;
	    System.out.println(df.format(ans));
	    
	  }

    
  
    

  }

}
