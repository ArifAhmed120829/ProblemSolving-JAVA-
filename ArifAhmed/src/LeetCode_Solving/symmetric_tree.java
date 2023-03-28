package LeetCode_Solving;

import LeetCode_Solving.SameTree.Node;

public class symmetric_tree {
	static class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}

	}
	static class linked {
		Node head;
		Node root;

		Node traverse(int val, Node curr) {
			if (curr != null && root == null) {
				root = curr;
			}
			if (curr == null) {
				return new Node(val);
			} else if (curr.val <= val) {
				curr.right = traverse(val, curr.right);
			} else if (curr.val >= val) {
				curr.left = traverse(val, curr.left);
			} else {
				return curr;
			}
			return curr;
		}

		void push(int val) {
			head = traverse(val, head);
		}
	}
	static class Solution {
		public boolean isSymmetric(Node root) {
			return check(root.left,root.right);
			
	    }
		public boolean check(Node left, Node right) {
			if(left == null || right == null) return left == right;
			else {
				return left.val == right.val &&
						check(left.left,right.right) && check(left.right,right.left);
			}
		}
	}

	public static void main(String[] args) {
		Solution sl = new Solution();
		linked ll1 = new linked();
		ll1.push(1);
		ll1.push(2);
		ll1.push(2);
		ll1.push(3);
		ll1.push(4);
		ll1.push(4);
		ll1.push(3);
		System.out.println(sl.isSymmetric(ll1.root));
		firstnode(ll1.root);

	}
	private static void firstnode(Node root) {
		if(root!=null) {
			System.out.println(root.val);
			firstnode(root.left);
			firstnode(root.right);
		}
		
	}

}
