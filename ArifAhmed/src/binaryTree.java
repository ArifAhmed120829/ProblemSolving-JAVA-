
public class binaryTree {
	static class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}

	static class BinaryTree {
		Node head;
		Node root;

		Node recursive(Node current, int value) {
			if (head == null && current != null) {
				head = current;
			}
			if (current == null) {
				return new Node(value);
			} else if (value < current.value) {
				current.left = recursive(current.left, value);
			} else if (value > current.value) {
				current.right = recursive(current.right, value);
			} else {
				return current;
			}
			return current;
		}

		void push(int value) {
			root = recursive(root, value);
		}

	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.push(6);
		bt.push(4);
		bt.push(8);
		bt.push(3);
		bt.push(5);
		bt.push(7);
		bt.push(9);
		findFullNode(bt.head);//6

	}

	public static void findFullNode(Node root) {
		if (root != null) {
			findFullNode(root.left);
			visit(root);
			findFullNode(root.right);
			
		}
	}

	private static void visit(Node root) {
		System.out.println(root.value);
		
	}

}
