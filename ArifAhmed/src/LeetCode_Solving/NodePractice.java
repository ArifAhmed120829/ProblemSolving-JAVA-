package LeetCode_Solving;
class basic_Node{
	int data;
	basic_Node next;
	basic_Node() {
		
	}
	basic_Node(int d, basic_Node n){
		this.data = d;
		this.next = n;
	}
	public int getData() {
		return data;
	}
	public void setData(int d) {
		this.data = d;
	}
	public basic_Node getNode() {
		return next;
	}
	public void setNode(basic_Node nd) {
		this.next = nd;
	}
	
}

public class NodePractice {

	public static void main(String[] args) {
		basic_Node x = new basic_Node(1,null);
		basic_Node y = new basic_Node(2,x);
		basic_Node z = new basic_Node(3,y);
		basic_Node z1 = null;
		System.out.println(z.getNode().getData());
		System.out.println(z1);
		
	}

}
