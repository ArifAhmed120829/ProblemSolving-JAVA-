package package_1;

public class output {
	static class Node {
		int data;
		Node next;

		Node() {

		}

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node nodeA = new Node(6);
		Node nodeN = new Node(7);
		Node nodeC = new Node(8);
		Node nodeD = new Node(9);
		Node nodeE = new Node(10);
		Node nodeF = new Node(11);

		nodeA.next = nodeN;
		nodeN.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
		nodeE.next = nodeF;
		
		countNode(deletenodeN(nodeA));
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

	private static Node deletenodeN(Node nodeA) {
		Node current = nodeA;
		
		Node newNode = new Node(nodeA.data);
		
		current = current.next.next;
		newNode.next = current;//wtf vai current memory gula mne rakhse
		//most Important part is here******
		while(current!= null) {
			//newNode.next = current; i thought it will be like this code
			current = current.next;
			
		}
		
		return newNode;

	}

}
