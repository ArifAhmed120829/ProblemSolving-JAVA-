package LeetCode_Solving;
class ListNode{
	int data;
	ListNode next;
	ListNode() {
		
	}
	ListNode(int val) {
		this.data = val; 
		}
	ListNode(int d, ListNode n){
		this.data = d;
		this.next = n;
	}
	
	
}
class Solution59 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp_node = new ListNode(0);
        ListNode res_node = temp_node;
        while(list1 != null && list2!= null) {
        	if(list1.data<list2.data) {
        		res_node.next = list1;
        		list1 = list1.next;
        	}
        	else {
        		res_node.next = list2;
        		list2 = list2.next;
        	}
        	res_node = res_node.next;
        }
        if(list1 != null) {
        	res_node.next = list1;
        }
        if(list2 != null) {
        	res_node.next = list2;
        }
        return temp_node.next;
    }
    
}


public class Merge_two_sorted_lists {

	public static void main(String[] args) {
		ListNode head = null;    
		ListNode tail = null;  
		ListNode newNode = new ListNode(1);  
		 tail.next = newNode;
		 ListNode newNode2 = new ListNode(2);  
		 tail.next = newNode2;
		 ListNode newNode3 = new ListNode(3); 
		 tail.next = newNode3;
		 System.out.println(tail);
		 
		
	
		
		

	}

}
