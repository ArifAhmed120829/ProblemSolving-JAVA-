package HackerRank_Solutions;
class Node{
	int data;
	Node next;
	
	public Node(int d) {
		data = d;
	}
	public Node head = null;
	public Node tail = null;
	
	void append(int d) {
		Node newnode = new Node(d);
		Node n = this;
		
		while(n.next!=null) {
			n = n.next;//sec - 1
		}
		n.next = newnode;//first - 1
		
		
	}
	public String toString() {
	    String result = data + " ";
	    if (next != null) {
	        result += next.toString();
	    }
	    return result;
	}
}

public class NodeSol {

	public static void main(String[] args) {
		Node n = new Node(1);
		int[] arr = {5,2,3,4,9};
		for(int val:arr) {
			n.append(val);
		}
		System.out.println(n.toString());

	}

}
