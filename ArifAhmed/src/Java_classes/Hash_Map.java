package Java_classes;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String,Integer> students = new HashMap<String,Integer>();
		students.put("Arif Ahmed", 12301);
		students.put("Sajal", 12381);
		students.put("Adnan", 12551);
		students.put("Jerin", 12401);
		if(students.get("Sajal")==12391) {
			students.remove("Sajal");
		}
		else if(students.containsKey("Jerin")) {
			students.put("Jerin", 12815);
		}
		System.out.println(students);
		double score1 = in.nextDouble();
		double score2 = in.nextDouble();
		HashMap<Double,Double> divers = new HashMap<Double,Double>();
		divers.put(1.0, score1);
		divers.put(3.0, score2);
		System.out.println(divers);

	}

}
