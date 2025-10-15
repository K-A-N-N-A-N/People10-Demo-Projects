public class Concur {
    int a = 0, b = 0, c = 0;
    volatile int v = 0;

    public void writerThread() {
        a = 1; 
        b = 2; 
        c = 3; 
        
        synchronized(this) {
            v = 4; // Volatile write
        }
    }

    public void readerThread() {
        int r2;
        synchronized(this) {
            r2 = v; // Volatile read
        }
        
        int x = a; 
        int y = b; 
        int z = c; 
        
        System.out.println("a = " + x + ", b = " + y + ", c = " + z + ", v = " + r2);
    }
}