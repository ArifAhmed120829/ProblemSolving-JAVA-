import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String,Integer> store = new HashMap<String,Integer>();
		store.put("a",10);
		store.put("b", 20);
		System.out.println(store.get("b"));
		HashMap<String,String> store2 = new HashMap<String,String>();
		store2.put("Arif199048@gmail.com","Arif199048..." );
		store2.put("ahmmmed199048@gmail.com", "ahmmmed199048...");
		store2.put("arif15-12301@diu.edu.bd", "Arif120829");
		
		System.out.println(store2.containsValue("Arif120829"));

	}

}
