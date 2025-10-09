record Person(String name, int age) {}

public class Trecord {
    public static void main(String[] args) {
        Person p1 = new Person("Kannan", 22);
        System.out.println(p1.name());
        System.out.println(p1);
    }
}

// Instead of this we use the above record syntax
/*class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() { return name; }
    public int age() { return age; }

    @Override
    public String toString() { return "Person[name=" + name + ", age=" + age + "]"; }
}
*/
