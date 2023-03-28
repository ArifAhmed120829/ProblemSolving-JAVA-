package LeetCode_Solving;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInordertraversal {
	static class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) {
		    	  this.val = val; 
		    	  }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		 }
	static class linked{
		TreeNode root;
		TreeNode head;
		TreeNode traverse(int val, TreeNode curr) {
			if(curr!=null && root == null) {
				root = curr;
			}
			if(curr==null) {
				return new TreeNode(val);
			}
			else if(curr.val>val) {
				curr.left = traverse(val,curr.left);
			}
			else if(curr.val<val) {
				curr.right = traverse(val,curr.right);
			}
			else {
				return curr;
			}
			return curr;
		}
		void push(int val) {
			head = traverse(val,head);
		}
	}
	static class Solution {
		List<Integer> list = new ArrayList<Integer>();
	    public List<Integer> inorderTraversal(TreeNode root) {
	     if(root!=null){
	         inorderTraversal(root.left);
	         list.add(root.val);
	         inorderTraversal(root.right);
	     }
	     return list;

	        
	    }
	}

	public static void main(String[] args) {
		Solution sl = new Solution();
		linked ll = new linked();
		List<Integer> list2 ;
		ll.push(10);
		ll.push(2);
		ll.push(11);
		
		list2 = sl.inorderTraversal(ll.root);
		System.out.println(list2);
		

	}

}
