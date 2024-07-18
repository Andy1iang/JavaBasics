import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class Chap05 {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(1); // adding to the end
        numList.add(0, 2); // adding at given index
        System.out.println(numList.get(1)); // getting element at given index
        numList.set(1, 3); // setting element at given index
        numList.remove(1); // removing given index

        // LinkedList
        LinkedList<Character> letterList = new LinkedList<Character>();
        letterList.add('a');
        letterList.add('b');
        System.out.println(letterList);
        letterList.remove(); // removes from head
        System.out.println(letterList);

        // HashMap
        HashMap<String, Integer> prices = new HashMap<String, Integer>();
        prices.put("Burger", 8);
        prices.put("Pizza", 10); // adding key value pair
        System.out.println(prices.get("Burger")); // getting value for key
        prices.replace("Burger", 9); // replacing value for key
        System.out.println(prices.get("Burger"));
        prices.remove("Burger"); // removing key value pair

        // Sets
        HashSet<String> names = new HashSet<String>();
        names.add("John");
        names.add("John");
        System.out.println(names);
        System.out.println(names.contains("Jane"));

        // .allAll to merge 2 sets
        // .retainAll to find the intersection between 2 sets
        // .removeAll to find the difference between 2 sets

    }
}
