public class Qclass {
    
    int queue[] = new int[5];
    int front, rear, size;

    public void enqueue(int data) {
        queue[rear] = data;
        rear = (rear + 1) % 5; // Circular increment , use queue.length for dynamic size
        size++;
    }

    public int dequeue() {
        int data = queue[front];
        front = (front + 1) % 5;
        size--;
        return data;
    }

    public void show(){
        System.out.println("Queue elements are : ");
        for (int i = 0; i < size; i++){
            System.out.print(queue[(front+i)%5] + " "); // front+i to start from front index
        }

        System.out.print("\nFull Queue array : ");
        for (int n : queue) {
            System.out.print(n + " "); // This will print all elements including dequed ones
        }
    }

}