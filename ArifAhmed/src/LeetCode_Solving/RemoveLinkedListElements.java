package LeetCode_Solving;

public class RemoveLinkedListElements {
	static class ListNode {
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
	}

	static class LiNode {
		static ListNode head;
		static ListNode tail;

		static void push(int d) {
			ListNode new_node = new ListNode(d);
			if (head == null) {
				head = new_node;
				tail = new_node;
			}
			tail.next = new_node;
			tail = new_node;

		}
	}

	static class Solution {
		public ListNode removeElements(ListNode head, int data) {
			if(head==null) {
				return head;
			}
			ListNode curr = head;
			ListNode prev = null;
			while(curr!=null) {
				if(head.val==data) {
					head = curr.next;
					curr = curr.next;
				}
				else {
					if(curr.val==data) {
						prev.next = curr.next;
						curr = curr.next;
					}
					else {
						prev = curr;
						curr = curr.next;
					}
				}
				
				
				
				
			}
			
			return head;

		}
	}

	public static void main(String[] args) {
		int[] arr = { 1,2,6,3,4,5,6};
		Solution ref = new Solution();
		for (int val : arr) {
			LiNode.push(val);
		}

		countNode(ref.removeElements(LiNode.head, 6));

	}

	private static void countNode(ListNode deletenode) {
		ListNode current = deletenode;
		int c = 0;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
			c++;
		}

	}

}
