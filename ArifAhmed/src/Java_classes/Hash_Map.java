package Java_classes;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
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
		

	}

}
