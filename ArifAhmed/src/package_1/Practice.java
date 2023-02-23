package package_1;

public class Practice {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(6);
		Node nodeb = new Node(5);
		Node nodec = new Node(4);
		Node noded = new Node(3);
		Node nodee = new Node(2);
		
		head.next = nodeb;
		nodeb.next = nodec;
		nodec.next = noded;
		noded.next = nodee;
		System.out.println(countnodes(head));
		System.out.println("---------> DISPLAY NODES");
		displaynodes(head);
		
		

	}

	private static void displaynodes(Node head) {
		Node current = head;
		
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;	
		}
		System.out.println(current);
		
	}

	private static int countnodes(Node head) {
		int count = 1;
		Node current = head;
		while(current.next != null) {
			current = current.next;
			count++;
		}
		return count;
	}

}
