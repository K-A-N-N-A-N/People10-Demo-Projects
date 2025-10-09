public class FourPillars {
    public static void main(String[] args){
       
        // Abstraction
        Enemy e1 = new Enemy();
        System.out.println("Abstarction Demo");
        e1.Speak(); // User only sees the speaking, so no matter what happens inside Speak() method, user is abstracted from it.


        // Inheritance and Polymorphism
        System.out.println("\nInheritance:");
        Vampire v1 = new Vampire();
        v1.Speak(); // Vampire class inherited Speak() method from Enemy class and overridden it.

        System.out.println("\nPolymorphism:");
        Enemy e2 = new Vampire(); // Upcasting
        e2.Speak(); // Runtime Polymorphism

        // Encapsulation
        System.out.println("\nEncapsulation:");
        Enemy e3 = new Enemy();
        // e3.health = 100; // Not allowed as health is private variable

        e3.setHealth(100); // Allowed as we are using public setter method
        e3.getHealth(); // Allowed as we are using public getter method
    }
}