import java.util.Stack;
public class StackPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// STACK = LIFO Data structure. Last-In First-Out
				// stores objects into a sort of "vertical tower"
				// push() to add to the top
				// pop() to remove from the top
				Stack<String> stack = new Stack<String>();
				/*
				 * 5 unique method available to Stack
				 * 1. push
				 * 2.pop
				 * 3.peek
				 * 4. search
				 * 5. Empty
				 */
				//System.out.println(stack.empty());
				stack.push("Fortnite");
				stack.push("Valorant");
				stack.push("Apex Legends");
				stack.push("Sea of thieves");
				stack.push("Euro Truck Simulator");
				stack.push("Gta V");
				String myfavgame = stack.pop(); 
				System.out.println(stack);
				System.out.println(myfavgame);
				System.out.println(stack.peek());
				System.out.println(stack.search("Valorant"));
	
				

	}

}
