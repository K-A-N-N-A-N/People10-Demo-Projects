import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class setNhashSet {
    public static void main(String[] args){

        // Create a set
        Set<String> set = new HashSet<>();
        set.add("Apple"); // Add elements to the set
        set.add("Banana");
        set.add("Orange");
        set.add("Banana"); // Duplicate, will not be added

        System.out.println("For Loop :");
        for (String fruit : set) {
            System.out.println(fruit); // Iterate through the set
        }

        System.out.println("\nIterator :");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nforEach with Lambda:");
        set.forEach(fruit -> System.out.println(fruit)); // Using forEach with lambda

        System.out.println("\nFull Set : "+set);
        System.out.println("Does Banana Exist : "+set.contains("Banana")); // Check if element exists
        set.remove("Apple"); // Remove element from the set
        System.out.println("Set after removing Apple : "+set);
        System.out.println("Set Size : "+set.size()); // Get size of the set
        set.clear(); // Clear the set
        System.out.println("Set after clear : "+set);
        System.out.println("Is Set Empty : "+set.isEmpty()); // Check if the set is empty

    }
}