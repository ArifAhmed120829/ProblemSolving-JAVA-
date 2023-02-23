package HackerRank_Solutions;

public class basic {
	static class Node {
		int data;
		Node next;

		Node() {

		}

		Node(int data) {
			this.data = data;
		}
	}

	static class LiNode {
		static Node head;
		static Node tail;

		static void push(int d) {
			Node new_node = new Node(d);// 2
			 //Checks if the list is empty    
	        if(head == null) {    
	            //If list is empty, both head and tail will point to new node    
	            head = new_node;    
	            tail = new_node;    
	        }    
	        else {    
	            //newNode will be added after tail such that tail's next will point to newNode    
	            tail.next = new_node;    
	            //newNode will become new tail of the list    
	            tail = new_node;    
	        }
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		for (int val : arr) {
			LiNode.push(val);
		}

		countNode(LiNode.head);

	}

	private static void countNode(Node nodeA) {
		Node current = nodeA;
		int c = 0;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
			c++;
		}
		// System.out.println(c);

	}

}
