import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditional_Statements {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N%2!=0) {
        	System.out.println("Weird");
        }
        else if(N%2==0 && N>=2 & N<=5) {
        	System.out.println("Not Weird");
        }
        else if(N%2==0 && N>=6 & N<=20) {
        	System.out.println("Weird");
        }
        else if(N%2==0 && N>20) {
        	System.out.println("Not Weird");
        }

        bufferedReader.close();

	}

}
