class GenClass <T> {  // GenClass <T, v, etc> for multiple types

    T obj; // If You use multiple types, you must use multiple variables

    GenClass(T obj) {
        this.obj = obj;
    }

    void showType() {
        System.out.println("Type of T is " + obj.getClass().getName());
    }

}

/* Example of Bounded Type Parameters
public class GenClass <T extends Number> { 

    T obj;

    Number getValue() {
        return obj;
    }

    double square() {
        return obj.doubleValue() * obj.doubleValue(); // only possible since T extends Number
    }

}

*/