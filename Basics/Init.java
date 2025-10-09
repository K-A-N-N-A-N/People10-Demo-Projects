class InstanceBlockExample {

    // Static block — runs once when the class is loaded
    static {
        System.out.println("Static block");
    }

    // Instance initializer block 1
    {
        System.out.println("Instance initializer block 1");
    }

    // Instance initializer block 2
    {
        System.out.println("Instance initializer block 2");
    }

    // Constructor
    public InstanceBlockExample() {
        System.out.println("Class constructor");
    }
}

public class Init {
    public static void main(String[] args) {
        System.out.println("Creating first object:");
        InstanceBlockExample obj1 = new InstanceBlockExample();

        System.out.println("\nCreating second object:");
        InstanceBlockExample obj2 = new InstanceBlockExample();
    }
}

/* Output:
    Creating first object:
    Static block
    Instance initializer block 1
    Instance initializer block 2
    Class constructor

    Creating second object:
    Instance initializer block 1
    Instance initializer block 2
    Class constructor
*/