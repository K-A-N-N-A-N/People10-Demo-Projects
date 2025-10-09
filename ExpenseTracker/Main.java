import java.util.Scanner;
import Services.WalletService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        WalletService walletService = new WalletService();    // Create an instance of WalletService

        System.out.println("### Welcome to Expense Tracker Application ####");
        System.out.println("------------------------------------------------");

        while (true) {
            System.out.println("\nChoose your option:");
            System.out.println("1. Log into an existing account");
            System.out.println("2. Create a new account");
            System.out.println("3. Delete an account");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            input = sc.nextLine().trim().toLowerCase();

            if (input.equals("4")) {
                System.out.println("Exiting the application. Goodbye!");
                break; 
            }

            switch (input) {
                case "1":
                    System.out.println("Logging into an existing account...");
                    // Add logic for logging into an existing account
                    break;
                case "2":
                    
                    System.out.print("Enter the account type (savings/current): ");
                    String accType = sc.next().trim().toLowerCase();
                    System.out.print("Enter your name: ");
                    String name = sc.next().trim();
                    System.out.print("Set your password: ");
                    String password = sc.next().trim();
                    System.out.print("Enter initial balance: ");
                    double balance = Double.parseDouble(sc.next().trim());

                    if (accType.equals("savings") && balance < 1000) {
                        System.out.println("Minimum balance for savings account is 1000.");
                        break;
                    } 
                    walletService.CreateAcc(accType, name, password, balance);

                    sc.nextLine(); // Consume the newline character
                    break;

                case "3":
                    System.out.println("Deleting an account...");
                    // Add logic for deleting an account
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close(); 
    }
}
