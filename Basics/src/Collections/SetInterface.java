package Collections;

import java.util.*;

// Set is the child interface of Collection interface.
// No duplicates are allowed.
// No insertion order is preserved (Except LinkedHashSet)
// One null is allowed.

public class SetInterface {

    public void hashSet() {

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(3);
        System.out.println(set);

        System.out.println("Size: " + set.size());

        set.remove(1);
        System.out.println(set);

        System.out.println(set.contains(1));

        set.clear();
        System.out.println(set);

    }

    public void linkedHashSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(20);
        set.add(50);
        set.add(10);
        set.add(30);
        System.out.println(set);

        System.out.println(set.contains(25));

        System.out.println(set.getFirst());
        System.out.println(set.getLast());

        set.removeFirst();
        System.out.println(set);
        set.removeLast();
        System.out.println(set);



    }

    public void treeSet() {

        // SortedSet interface
        SortedSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(50);
        set.add(10);
        set.add(30);
        System.out.println(set);

        System.out.println(set.comparator());

        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set.subSet(20, 50));

        System.out.println(set.headSet(20));
        System.out.println(set.tailSet(20));

        set.clear();
        System.out.println(set);

        // NavigableSet interface
        NavigableSet<Integer> set2 = new TreeSet<>();
        set2.add(20);
        set2.add(50);
        set2.add(10);
        set2.add(30);
        set2.add(25);
        System.out.println(set2);

        System.out.println(set2.lower(30));
        System.out.println(set2.higher(25));
        System.out.println(set2.floor(50));
        System.out.println(set2.ceiling(30));

        set2.pollFirst();
        System.out.println(set2);
        set2.pollLast();
        System.out.println(set2);

        // TreeSet class
        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.add(20);
        treeset.add(50);
        treeset.add(10);
        treeset.add(30);
        treeset.add(25);
        treeset.add(40);
        System.out.println(treeset);

    }

    static void main() {

        SetInterface obj = new SetInterface();
        obj.hashSet();
        obj.linkedHashSet();
        obj.treeSet();

    }
}
