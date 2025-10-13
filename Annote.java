public class A{
    public void showClassName(){
        System.out.println("Class Name: A");
    }
}

public class B extends A{
    @Override // Annotation to indicate that this method overrides a method in the superclass
    public void showClassName(){ // Compiler will check if this method correctly overrides (spelled) a method in superclass A
        System.out.println("Class Name: B");
    }
}

public class Annote {
    public static void main(String[] args){

        A obj = new B(); // Upcasting
        obj.showClassName(); // Calls B's overridden method
    }
}