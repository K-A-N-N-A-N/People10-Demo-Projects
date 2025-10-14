import java.util.HashMap;

public class mapNhash {
    public static void main(String[] args) {

        // Craete a Map
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 1); // Insert key-value pair
        map.put("Banana", 2);
        map.put("Orange", 3);

        System.out.println("Full Map : "+map);
        System.out.println("Banana Value : "+map.get("Banana")); // Access value by key
        System.out.println("Does Grape Exist  "+map.containsKey("Grapes")); // Check if key exists
        System.out.println("Does The value 3 Exist : "+map.containsValue(3)); // Check if value exists
        map.remove("Apple"); // Remove key-value pair by key
        System.out.println("Map after removing Apple : "+map);
        System.out.println("Map Size : "+map.size()); // Get size of the map
        map.clear(); // Clear the map
        System.out.println("Map after clear : "+map);
    }
}