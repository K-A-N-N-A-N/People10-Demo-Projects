import java.util.*;

public class input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = sc.next();
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // 👈 consume the leftover newline

        System.out.print("\nEnter Your Full name: ");
        String Fname = sc.nextLine();
        System.out.println("Your name is "+name);
        System.out.println("Your full Full Name is "+Fname);
        System.out.println("Your Age is "+age);
    }
}