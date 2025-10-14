public class ExceptHandle {
    public static void main(String[] args){
        try {
            int data = 100/0;
            System.out.println(data);

            int var = Integer.parseInt("abc");
            System.out.println(var);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (NumberFormatException nfe){  // Even thouhh We used nfe, the catch block first catches ArithmeticException and henec nfe is never executed
            System.out.println(nfe);
        }
        System.out.println("End of code...");
    }
}