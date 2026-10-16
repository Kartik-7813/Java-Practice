package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

// Queue is child interface of Collection interface.
// Follows FIFO manner.

public class QueueInterface {

    public void priorityQueue(){
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(25);
        queue.add(40);
        queue.add(50);
        queue.add(10);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println(queue);

    }

    public void arrayDeque(){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(25);
        deque.add(40);
        deque.add(50);
        deque.add(10);
        System.out.println(deque);

        deque.addFirst(9);
        System.out.println(deque);
        deque.addLast(8);
        System.out.println(deque);

        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

    }

    static void main() {

        QueueInterface obj = new QueueInterface();
        obj.priorityQueue();
        obj.arrayDeque();

    }
}
