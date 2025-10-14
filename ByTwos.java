public class ByTwos implements interClass { // When u implement an interface, you must implement all its methods
    int val1;

    ByTwos () {
        val1 = 0;
    }

    public int getNext() {
        if (val1 >= MAX) {
            System.out.println(ErrorMsg);
        }
        else{
             val1 += 2;
        }
        return val1;
    }
}
