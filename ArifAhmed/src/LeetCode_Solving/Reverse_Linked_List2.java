package LeetCode_Solving;

public class Reverse_Linked_List2 {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static class LinkedList {
		Node head;
		Node tail;

		void push(int d) {
			Node newnode = new Node(d);
			if (head == null) {
				head = newnode;
				tail = newnode;
			} else {
				tail.next = newnode;
				tail = newnode;
			}
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int val : arr) {
			ll.push(val);
		}

		showNodes(reverseNodes(ll.head));

	}

	private static Node reverseNodes(Node head) {
		if (head == null) {
			return head;
		}
		Node curr = head;
		Node prev = null;
		Node next = null;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;

	}

	private static void showNodes(Node head) {
		if (head == null) {
			return;
		}
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}

	}

}
