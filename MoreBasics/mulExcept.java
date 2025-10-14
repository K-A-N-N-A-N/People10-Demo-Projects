public class mulExcept {
    public static void main(String[] args) {

        try {
            getInt();
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Exception : " + e);
        } finally {
            System.out.println("Always executed block...");
        }
    }

    private static void getInt() {
        int data = Integer.parseInt("abc");
    }
}