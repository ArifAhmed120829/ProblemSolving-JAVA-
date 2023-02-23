package package_1;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(6);
		ListNode nodeb = new ListNode(5);
		ListNode nodec = new ListNode(4);
		ListNode noded = new ListNode(3);
		ListNode nodee = new ListNode(2);
		head.next = nodeb;
		nodeb.next = nodec;
		nodec.next = noded;
		noded.next = nodee;

		Solution ob = new Solution();
		
		//deleteNode(6, head);
		if(head.val==6) {
			head = head.next;
		}
		//System.out.println(head.val);
		System.out.println(ob.printList(head));
	}
	public static void deleteNode(int data, ListNode head) {
		
		if(head.val==data) {
			head = head.next;
		}
		

	}

}

class Solution {
	public ListNode printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
		return current;

	}

	
}
