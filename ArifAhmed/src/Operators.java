import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */
	

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    	double real_meal_cost = meal_cost;
    	meal_cost = (meal_cost/100);
    	double tip = meal_cost *tip_percent; 
    	double tax = meal_cost * tax_percent;
    	double total_cost = (real_meal_cost+tip+tax);
    	System.out.println(Math.round(total_cost));

    }

}



public class Operators {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
		

	}

}
