import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class EOF {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner input_file  = new Scanner(new FileReader("ArifScore.txt"));
		PrintWriter output_file = new PrintWriter("outputforArifScore.txt");
		String Subject_name;
		double score;
		char grade = ' ';
		int counter = 0;
		while(input_file.hasNext()) {
			Subject_name = input_file.next();
			score = input_file.nextDouble();
			counter++;
			switch ((int) score/10) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				grade = 'A';
				break;
			case 7:
				grade = 'B';
				break;
			case 8:
				grade  = 'V';
				break;
			case 9:
				grade = 'D';
				break;
		
				
			default:
				output_file.println("Your score is invalid");
					
			}
			output_file.println(Subject_name+" "+score+" "+" "+grade);
		}
		if(counter == 0)
			output_file.println("There are no data in the input file");
		output_file.close();
	
		}

	}


