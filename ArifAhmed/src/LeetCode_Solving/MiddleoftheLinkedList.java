package LeetCode_Solving;

public class MiddleoftheLinkedList {
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
			Node newnode = new Node(d);
			if(head == null) {
				head = newnode;
				tail = newnode;
			}
			else {
				tail.next = newnode;
				tail = newnode;
			}
		}
	}

	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5};
		LinkedList ll = new LinkedList();
		for(int val:arr) {
			ll.push(val);
		}
		showNodes(countNodes(ll.head));

	}

	private static void showNodes(Node countNodes) {
		Node c = countNodes;
		while(c!=null) {
			System.out.println(c.data);
			c= c.next;
		}
		
	}

	private static Node countNodes(Node head) {
		if(head==null) return head;
		Node curr = head;
		Node prev = null;
		int count = 0;
		while(curr!=null) {
			curr = curr.next;
			count++;
		}
		Node c2 = head;
		int j = count;
		count = count/2;
		if(j%2!=0) {
			count = count + 1;
		}
		while(c2!=null) {
			if(j==count) {
				prev = c2;
			}
			c2=c2.next;
			
			j--;
		}
		return prev;
		
	}

}
