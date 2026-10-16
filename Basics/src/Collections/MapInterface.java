package Collections;
import java.util.*;

// Map is a separate interface in collections framework & not part of collection interface.
// Stores data in key-value pairs.
// Keys must be unique, duplicate values are allowed.

public class MapInterface {

    public void hashMap() {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kartik");
        map.put(2, "Shreyas");
        map.put(3, "Om");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Kartik"));

        map.remove(3);
        System.out.println(map);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(3, "Yash");
        map2.put(4, "Parimal");

        map.putAll(map2);
        for(Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

    public void linkedHashMap() {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Kartik");
        map.put(3, "Shreyas");
        map.put(4, "Om");
        map.put(2, "Yash");
        System.out.println(map);
    }

    public void treeMap() {

        // SortedMap interface
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(1, "Kartik");
        sortedMap.put(3, "Shreyas");
        sortedMap.put(4, "Om");
        sortedMap.put(2, "Yash");
        System.out.println(sortedMap);

        System.out.println(sortedMap.firstEntry());
        System.out.println(sortedMap.lastEntry());

        System.out.println(sortedMap.subMap(1, 3));

        // NavigableMap interface
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "Kartik");
        navigableMap.put(3, "Shreyas");
        navigableMap.put(4, "Om");
        navigableMap.put(2, "Yash");
        System.out.println(navigableMap);

        System.out.println(navigableMap.lowerEntry(3));
        System.out.println(navigableMap.higherEntry(3));

        // TreeMap Class
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Kartik");
        treeMap.put(3, "Shreyas");
        treeMap.put(4, "Om");
        treeMap.put(2, "Yash");
        treeMap.put(5, "Parimal");
        System.out.println(treeMap);

        System.out.println(treeMap.descendingMap());

        treeMap.pollFirstEntry();
        System.out.println(treeMap);

        treeMap.pollLastEntry();
        System.out.println(treeMap);

        System.out.println(treeMap.floorEntry(2));
        System.out.println(treeMap.ceilingEntry(3));
    }

    static void main() {

        MapInterface obj = new MapInterface();
        obj.hashMap();
        obj.linkedHashMap();
        obj.treeMap();

    }
}
