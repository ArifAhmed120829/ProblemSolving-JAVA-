import java.util.LinkedList;
import java.util.Scanner;

public class Linked_Lists {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<String>();//Stack
		linkedlist.push("A");
		linkedlist.push("B");
		linkedlist.push("C");
		linkedlist.push("D");
		linkedlist.push("F");
		linkedlist.pop();
		System.out.println(linkedlist);
		LinkedList<String> linkedlist2 = new LinkedList<String>();//Queue
		linkedlist2.offer("hi");
		linkedlist2.offer("Bye");
		linkedlist2.offer("Cow");
		linkedlist2.offer("Dog");
		linkedlist2.offer("Frog");
		linkedlist2.poll();
		
		System.out.println(linkedlist2.peekFirst());
		System.out.println(linkedlist2.peekLast());
		linkedlist2.addFirst("0");
		linkedlist2.addLast("G");
		System.out.println(linkedlist2);
		 
		
		

	}

}
