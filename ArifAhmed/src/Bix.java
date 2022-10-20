import java.util.LinkedList;

//Byte Information Exchange
public class Bix {

	public static void main(String[] args) {
		Solutionzzzzzz myobj = new Solutionzzzzzz();
		ListNode sList = new ListNode();
		sList.val = 2;
		sList.val = 4;
		sList.val = 3;
		ListNode sList2 = new ListNode();
		sList2.val = 5;
		sList2.val = 6;
		sList2.val = 4;
		System.out.println(sList.val+" "+ sList2.val);
		
		 

	}

}
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solutionzzzzzz {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode head = new ListNode(0);
    ListNode l3 = head;
    int carry = 0;
    while(l1 != null || l2 != null) {
      int l1_val = (l1!= null) ? l1.val : 0;
      int l2_val = (l2!= null) ? l2.val : 0;
      int current_sum = l1_val + l2_val + carry;
      carry = current_sum/10;
      int last_digit = current_sum%10;
      ListNode newnode = new ListNode(last_digit);
      l3.next = newnode;
      if(l1!=null) l1 =  l1.next;
      if(l2!=null) l2 =  l2.next;
      l3 = l3.next;
    }
    if(carry>0) {
      ListNode newnode = new ListNode(1);
      l3.next = newnode;
      l3 = l3.next;
    }
    return head.next;
    
        
    }
}
