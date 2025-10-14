public class interfacess {
    public static void main(String[] args) {
        System.out.println("Interfaces in Java");   

        ByTwos obj1 = new ByTwos();
        ByThrees obj2 = new ByThrees();

        obj1.reset(); // Calling default method of interface Even fro ByTwos class

        interClass obj; // Interface reference variable

        for(int i=0; i<8; i++){
            
            obj = obj1; // obj now refers to ByTwos object
            System.out.println("Increment By 2 : "+obj.getNext());

            obj = obj2; // obj now refers to ByThrees object
            //System.out.println("Increment By 3 : "+obj.getNext());


            //System.out.println(obj2.getNext()); For calling any method in normal way
        }
    }
}
