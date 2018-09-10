package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(25);
        queue.add(23);
        queue.add(15);
        queue.add(10);

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove());

        System.out.println("for each loop to get data : ");
        for (Integer x : queue){
            System.out.println(x);
        }
        Iterator it = queue.iterator();
            while(it.hasNext()){
                Integer i = (Integer) it.next();
                System.out.println(i);
            }
	}

}
