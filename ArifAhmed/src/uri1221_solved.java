import java.util.Scanner;

public class uri1221_solved {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		  int n, teste, i, j;
		    long p;
		    
		    n = in.nextInt();
		    
		    for(i = 0; i <n; i++){
		            teste = 0;
		            p = in.nextLong();
		            
		            if(p == 0){
		                 System.out.println("Not Prime");
		                 continue;
		            }
		            
		            if(p == 1){
		                 System.out.println("Not Prime");
		                 continue;
		            }
		            
		            if(p == 2){
		                 System.out.println("Prime");
		                 continue;
		            }
		            
		            for(j = 2; j < Math.sqrt(p)+1; j++){
		                    if(p%j == 0) teste++;
		                    if(teste == 2) break;
		            }
		            
		            if(teste >= 1) System.out.println("Not Prime");
		            else System.out.println("Prime");
		    }

	}

}
