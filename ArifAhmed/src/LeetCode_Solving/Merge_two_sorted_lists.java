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
	public int getData() {
		return data;
	}
	public void setData(int d) {
		this.data = d;
	}
	public ListNode getNode() {
		return next;
	}
	public void setNode(ListNode nd) {
		this.next = nd;
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
		ListNode Ln = new ListNode(1,null);
		ListNode Ln2 = new ListNode(2,Ln);
		ListNode Ln3 = new ListNode(3,Ln2);
		ListNode Ln4 = new ListNode(4,Ln3);
		ListNode Ln5 = new ListNode(5,Ln4);
		ListNode Ln6 = new ListNode(6,Ln5);
		ListNode list1 = new ListNode(Ln.getData(),Ln.next);
		list1 = new ListNode(Ln2.getData());
		list1 = new ListNode(Ln3.getData());
		ListNode list2 = new ListNode(Ln4.getData());
		list2 = new ListNode(Ln5.getData());
		list2 = new ListNode(Ln6.getData());
		Solution59 ans = new Solution59();
		System.out.println(ans.mergeTwoLists(list1.next, list2.next));
		System.out.println(list1.getData());
		System.out.println(list1.getData());
		System.out.println(list1.getData());
		
		
		

	}

}
