import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Priority Queue = A FIFO data structure that serves elements with the highest priorities first
		//before elements with lower priority
		
		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
		queue.offer(3.8);
		queue.offer(3.2);
		queue.offer(3.5);
		queue.offer(3.6);
		queue.offer(3.0);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
