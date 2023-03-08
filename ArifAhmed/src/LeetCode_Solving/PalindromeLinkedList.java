package LeetCode_Solving;

public class PalindromeLinkedList {
	static class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
		}
	}
	static class LinkedList{
		Node head;
		Node tail;
		void push(int data) {
			Node newN = new Node(data);
			if(head==null) {
				head = newN;
				tail = newN;
			}
			else {
				tail.next = newN;
				tail = newN;
			}
		}
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		int[] arr = {1,2,7,2,1};
		for(int v:arr) {
			l.push(v);
		}
		
		System.out.println(rev(l.head));

	}

	private static boolean rev(Node head) {
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		slow = reverse(slow);
		fast = head;
		
		while(slow !=null ) {
			if(slow.val!=fast.val) {
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		return true;
		
		
		
		
		
	}

	private static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}



}
