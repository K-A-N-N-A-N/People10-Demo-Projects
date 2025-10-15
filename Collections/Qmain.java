public class Qmain {
    public static void main(String[] args) {
        Qclass q = new Qclass();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.show();

        System.out.println("\nDequeued element : " + q.dequeue());
        System.out.println("Dequeued element : " + q.dequeue());
        q.enqueue(60);
        q.show();
    }
}