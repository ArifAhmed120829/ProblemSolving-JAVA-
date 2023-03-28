
public class bin_tree_traversal {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	static class Tree{
		Node root;
		Node head;
		Node traverse(Node curr, int data) {
			if(root==null && curr!= null) {
				root = curr;
			}
			if(curr == null) {
				return new Node(data);
			}
			else if(curr.data<data) {
				curr.right = traverse(curr.right,data);
			}
			else if(curr.data>data) {
				curr.left = traverse(curr.left,data);
			}
			else {
				return curr;
			}
			return curr;
			
		}
		void push(int data) {
			head = traverse(head,data);
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {6,4,8,3,5,7,9};
		Tree tr = new Tree();
		for(int val:arr) {
			tr.push(val);
		}
		traverse(tr.root);
		

	}

	private static void traverse(Node root) {
		if(root != null) {
			traverse(root.left);
			System.out.println(root.data);
			traverse(root.right);
			
			
		}
		
	}

}
