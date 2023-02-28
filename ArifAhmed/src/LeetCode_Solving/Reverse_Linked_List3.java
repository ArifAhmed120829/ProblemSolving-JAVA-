package LeetCode_Solving;



public class Reverse_Linked_List3 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	static class LinkedList{
		Node head;
		
		void push(int d) {
			Node newnode = new Node(d);
			newnode.next = head;
			head = newnode;
		}
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int[] arr = {1,2,3,4,5};
		for(int val:arr) {
			ll.push(val);
		}
		
		showNodes(ll.head);

	}

	private static void showNodes(Node head) {
		if(head==null) {
			return;
		}
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		
		
	}

	

}
