import java.util.LinkedList;
import java.util.Queue;

public class queuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// QUEUE = FIFO DATA STRUCTURE. First-In First-Out (ex: A line of people)
		// A collection designed for holding elements prior to processing Linear data Structure
		// add = enqueue, offer()
		//remove = dequeue, poll()
		Queue<String> queue = new LinkedList<String>();//Queue is an interface, not a class.
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Arif");
		queue.offer("Hamim");
		System.out.println(queue.peek());
		System.out.println(queue);
		
		System.out.println(queue.size());
		System.out.println(queue.contains("Arif"));
		//This three are inherited from collection by queue.
		

	}

}
