package Collections;

import java.util.*;

// List is child interface of Collection interface.
// Stores data in contiguous memory locations.
// Multiple duplicates & null values are allowed.
// Provides index-based random access.
// Insertion order is maintained.

public class ListInterface {

    public void arrayList() {

        // ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //Iterator
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Element at index 2: "+list.get(2));

        list.set(2, 5);
        System.out.println(list);

        int size = list.size();
        System.out.println("Size: "+size);

        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        size = list.size();
        System.out.println("Size: "+size);
    }

    public void linkedList() {

        //LinkedList
        List<String> list = new LinkedList<>();
        list.add("Kartik");
        list.add("shreyas");
        System.out.println(list);

        list.add(2, "yash");
        System.out.println(list);

        System.out.println(list.contains("shreyas"));

        System.out.println("Size: "+list.size());

        list.set(2, "om");
        System.out.println(list);
    }

    public void vector() {

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.addElement(20);
        vector.addElement(30);
        System.out.println(vector);

        vector.removeElement(20);
        System.out.println(vector);
        vector.removeAllElements();
        System.out.println(vector);

        System.out.println(vector.isEmpty());
        System.out.println(vector.size());
        System.out.println(vector.capacity());

        for(int i=1; i<=10; i++ ) {
            vector.add(i);
        }
        System.out.println(vector);
        System.out.println(vector.capacity());

        vector.add(11);
        System.out.println(vector);
        System.out.println(vector.capacity());

        System.out.println(vector.elementAt(3));

    }

    public void stack() {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.search(3));
    }

    static void main() {

        ListInterface obj = new ListInterface();
        obj.arrayList();
        obj.linkedList();
        obj.vector();
        obj.stack();

    }

}
