package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAndPriorityQueue {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Whatsapp");
		queue.add("Faceboock");
		queue.add("Twitter");
		queue.add("Amazon Pay");
		queue.add("Phone Pe");
		queue.add("Paytm");
		System.out.println(queue);
		System.out.println("Head:"+ queue.element());
		System.out.println("Head:"+ queue.peek());
		for (String str : queue) 
		{
			System.out.println(str);
		}
		
		// Remove the element from head
		queue.remove();
		queue.poll();
		
		System.out.println("List of elements after removing");
		for (String str : queue) 
		{
			System.out.println(str);
		}
	}

}
