class MulThread extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MulThread thread1 = new MulThread();
        MulThread thread2 = new MulThread();
        MulThread thread3 = new MulThread();

        thread1.start();
        thread2.start();
        thread3.start();

        // If u use run() instead of start(), it will run sequentially in the main thread
    }
}