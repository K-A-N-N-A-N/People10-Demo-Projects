import java.util.Arrays;

class Processor {
    public void process(int i, int j) {
         System.out.printf("Processing two integers:%d, %d", i, j);
    }

    public void process(int[] ints) {  // method overloading with different parameter type
        System.out.println("\nAdding integer array:" + Arrays.toString(ints));
    }

    public void process(Object[] objs) { // method overloading with different parameter type
        System.out.println("\nAdding integer array:" + Arrays.toString(objs));
    }
}

class MathProcessor extends Processor {

    @Override
    public void process(int i, int j) { // method overriding with same parameter type from parent class
        System.out.println("Sum of integers is " + (i + j));
    }

    @Override
    public void process(int[] ints) { // method overriding with same parameter type from parent class
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        System.out.println("Sum of integer array elements is " + sum);
    }
}

public class Method {
    public static void main(String[] args) {
        Processor p = new Processor();
        p.process(10, 20);
        p.process(new int[]{1, 2, 3, 4, 5});
        p.process(new String[]{"A", "B", "C"});

        MathProcessor mp = new MathProcessor();
        mp.process(10, 20);
        mp.process(new int[]{1, 2, 3, 4, 5});
    }
}