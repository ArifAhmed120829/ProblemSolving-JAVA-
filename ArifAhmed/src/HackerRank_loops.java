import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerRank_loops {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i<=10; i++) {
        	System.out.println(n+" x "+i+" = "+n*i);
        }

        bufferedReader.close();

	}

}
