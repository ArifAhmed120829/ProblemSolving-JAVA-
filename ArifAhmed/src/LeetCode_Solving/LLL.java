package LeetCode_Solving;
class Node{
	int num;
	Node pointer;
	
}
class Linked{
	public void printlist(Node i) {
		if(i== null) {
			return;
		}
		System.out.print(i.num+" ");
		printlist(i.pointer);
	}
	public Node NewNode(int value) {
		Node node1 = new Node();
		node1.num = value;
		node1.pointer = null;
		return node1;
		
	}
	public Node insert(int b, Node node) {
		//Check if the node is null
		if(node == null) {
			//we create a new node
			return NewNode(b);
		}
		else {
			node.pointer = insert(b, node.pointer);
		}
		return node;
	}
}

public class LLL {

	public static void main(String[] args) {
		Node head = null;// head reference
		Linked a = new Linked();
		head = a.insert(12,head);
		head = a.insert(99, head);
		head = a.insert(0, head);
		a.printlist(head);

	}

}
