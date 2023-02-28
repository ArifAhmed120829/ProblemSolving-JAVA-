package LeetCode_Solving;

public class ConvertBinaryNumber {
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
		}
	}
	static class LinkedList{
		Node head;
		Node tail;
		void push(int d) {
			Node newnode = new Node( d);
			if(head==null) {
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
		LinkedList ll = new LinkedList();
		int arr[] = {0};
		for(int val:arr) {
			ll.push(val);
		}
		System.out.println(convert(ll.head));

	}

	private static int convert(Node head) {
		Node curr = head;
		int count = 0;
		int sum = 0;
		int multi;
		while(curr!=null) {
			curr = curr.next;
			count++;
		}
		Node curr2 = head;
		count = count -1;
		while(curr2!=null) {
			int pow = count;
			multi = curr2.data*square(2,pow);
			sum = sum + multi;
			curr2 = curr2.next;
			count--;
		}
		return sum;
		
	}

	private static int square(int i, int count) {
		if(count==1) {
			return i;
		}
		if(count<1) {
			return 1;
		}
		i = i*2;
		count = count - 1;
		return square(i,count);
	}





}
