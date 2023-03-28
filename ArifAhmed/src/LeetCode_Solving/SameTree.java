package LeetCode_Solving;


public class SameTree {
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
	    public boolean isSameTree(Node p, Node q) {
	    	if(p==null || q == null) return p==q;
				return (p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	}
	}

	public static void main(String[] args) {
		Solution sl = new Solution();
		linked ll1 = new linked();
		linked ll2 = new linked();
		ll1.push(1);
		ll1.push(2);
		ll1.push(1);
		ll2.push(10);
		ll2.push(2);
		ll2.push(1);
		System.out.println(sl.isSameTree(ll1.root, ll2.root));
		firstnode(ll1.root);
		secondnode(ll2.root);
	}

	private static void secondnode(Node root) {
		if(root!=null) {
			System.out.println(root.val);
			secondnode(root.left);
			secondnode(root.right);
		}
		
	}

	private static void firstnode(Node root) {
		if(root!=null) {
			System.out.println(root.val);
			firstnode(root.left);
			firstnode(root.right);
		}
		
	}


}
