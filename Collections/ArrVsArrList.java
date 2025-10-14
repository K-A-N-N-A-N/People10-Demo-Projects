import java.util.ArrayList;
import java.util.Arrays;

class ArrVsArrList {
    public static void main(String[] args) {

        // Arrays
        String[] arr = new String[3]; // Array of fixed size 3
        arr[0] = "Apple";

        String[] arr2 = {"Banana", "Orange", "Grapes"}; // Array initialized with values

        // ArrayList
        ArrayList<String> arrList = new ArrayList<>(); // Dynamic array (ArrayList)
        arrList.add("Mango");

        ArrayList<String> arrList2 = new ArrayList<>(
            Arrays.asList("Pineapple", "Peach", "Cherry")); // ArrayList initialized with values

        System.out.println("Array elements:");
        System.out.println(arrList2.get(1)); // Accessing element at index 1

        // To set a value at a specific index in ArrayList
        arrList2.set(1, "Watermelon");

        // To remove an element from ArrayList
        arrList2.remove(0); // Removes element at index 0 or arrList2.remove("Pineapple");

        // WHile prinitng, array needs to be iterated but arrayList:
        System.out.println(arrList2);


    }
}