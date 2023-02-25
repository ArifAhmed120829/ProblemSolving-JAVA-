package LeetCode_Solving;

public class RemoveDuplicatesfromSortedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	static class LinkedList{
		Node head;
		Node tail;
		void push(int d) {
			Node newNode = new Node(d);
			if(head==null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,1,2};
		LinkedList ll = new LinkedList();
		for(int val:arr) {
			ll.push(val);
		}
	
		show(Deleteduplicates(ll.head));

	}

	private static void show(Node deleteduplicates) {
		Node current = deleteduplicates;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}

	private static Node Deleteduplicates(Node head) {
		Node prev = head;
		Node curr = head;
		
		if(head==null) {
			return head;
		}
		
		while(curr!=null) {
			
			if(prev!=null) {
				if(prev.data==curr.data) {
					prev.next  =  curr.next;
				}
				else {
					prev = curr;
				}
			}
			else {
				prev = curr;
			}
			curr = curr.next;
			
		}
		
		
		return head;
	}

}
