
class Main2 {
	Main2 next = null;
	int x;

	// Constructor with a parameter
	public Main2(int x) {
		this.x = x;
	}
	void appendtoTail(int x) {
		Main2 end =new Main2(x);
		Main2 newNode = this;
		while(newNode.next != null) {
			newNode=  newNode.next;
		}
		newNode.next = end;
	}
	public String toString() {
	    String result = x + " ";
	    if (next != null) {
	        result += next.toString();
	    }
	    return result;
	}
	
}

public class linkedlistpractice {

	public static void main(String[] args) {
		Main2 m = new Main2(5);
		int[] arr = {1,2,3,4,9};
		for(int val:arr) {
			m.appendtoTail(val);
		}
		
		System.out.println(m.toString());
		

	}

}
