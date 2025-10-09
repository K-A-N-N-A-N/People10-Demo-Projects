class A{
    private int a;
    private float b;

    A(){
        System.out.println("Constructor of A called");
    }

    public A seta(int a){
        this.a = a;
        return this;
    }

    public A setb(float b){
        this.b = b;
        return this;
    }

    void display(){
        System.out.println("Display :"+ a + " " + b);
    }
}

public class mchain {
    public static void main(String[] args){
        new A().seta(10).setb(20.5f).display();
    }
}