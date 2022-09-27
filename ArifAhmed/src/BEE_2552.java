import java.util.Scanner;

public class BEE_2552 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();//1
			int m = in.nextInt();//2
			String[] result = new String[n];
		      int[][] array = new int[n][m];//array[1][2]
		      for (int i = 0; i < n; i++) {

		        for (int j = 0; j < m; j++) {
		          int m1 = in.nextInt();
		          array[i][j] = m1;
		        }
		        
		      }
		      int x = 0;
		      
		      for (int i = 0; i < n; i++) {
		    	  result[i] = "";
		    	  for(int j = 0; j<m; j++) {
		    		  x = 0;
		    		  if(array[i][j] != 1) {
		    			  if(j+1<m) {
		    				  x = array[i][j] + array[i][j+1]+x; 
		    			  }
		    			  if(i+1<n) {
		    				  x = array[i][j] + array[i+1][j]+x;
		    			  }
		    			  if(j-1>=0) {
		    				  x = array[i][j] + array[i][j-1]+x;
		    			  }
		    			  if(i-1>=0) {
		    				  x = array[i][j] + array[i-1][j]+x;
		    			  }
		    			  
		    		  }
		    		  else {
		    			  x = 9;
		    		  }
		    		  result[i] = result[i] + x;
		    	  }

		        System.out.println(result[i]);
		        
		      }
		}

	}

}
