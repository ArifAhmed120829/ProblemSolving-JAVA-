package HackerRank_Solutions;


public class NodeSol {
	class Node{
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
		}
	}
		public Node head = null;
		public Node tail = null;
		
		void addnode(int d) {
			Node newnode = new Node(d);
			if(head==null) {
				head = newnode;
				tail = newnode;
			}
			else {
				tail.next = newnode;
				tail = newnode;
			}
			
			
		}
		int countnodes() {
			Node current = head;
			int var = 0;
			while(current!= null) {
				var++;
				current = current.next;
			}
			return var;
		}
		void display() {
			Node current = head;
			if(head == null) {
				System.out.println("List is empty");
				return;
			}
			System.out.println("Nodes of singly linked list: ");
			while(current!= null) {
				System.out.println(current.data+" ");
				current = current.next;
			}
			System.out.println();
			
		}
	

	public static void main(String[] args) {
		
		   NodeSol sol = new NodeSol();
           
	        //Add nodes to the list    
	        sol.addnode(1);    
	        sol.addnode(2);    
	        sol.addnode(3);    
	        sol.addnode(4);    
	            
	        //Displays the nodes present in the list    
	        sol.display();    
	            
	        //Counts the nodes present in the given list    
	        System.out.println("Count of nodes present in the list: " + sol.countnodes()); 

	}

}
