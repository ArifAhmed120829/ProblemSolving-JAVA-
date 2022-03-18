import java.util.Scanner;

public class RoundUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Make a simple percantage of a given numbers
		Scanner in = new Scanner(System.in);
		int theory_mark = in.nextInt();
		int practical_mark = in.nextInt();
		int total_mark = in.nextInt();
		int percentage_of_marks = ((theory_mark+practical_mark)*100)/total_mark;
		System.out.println("result: "+percentage_of_marks+"%");

	}

}
