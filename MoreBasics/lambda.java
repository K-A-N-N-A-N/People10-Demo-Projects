Interace A {
    void show();
}

public class lambda {
    public static void main(String[] args) {
        // Lambda expression to implement the show method of interface A
        A obj = () -> System.out.println("Hello, this is a lambda expression!");
        obj.show();

        /* Without Lambda expression
        A obj2 = new A() { // Anonymous class implementing interface A
            public void show() {
                System.out.println("Hello, this is an anonymous class!");
            }
        };
        */
    }
}