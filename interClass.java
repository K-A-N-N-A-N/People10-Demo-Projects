public interface interClass {

    int MAX = 5; // final and static by default
    String ErrorMsg  = "Highest Value Reached"; // final and static by default

    int getNext();

    default void reset() { // default method
        System.out.println("Resetting Value to 0");
    }
}