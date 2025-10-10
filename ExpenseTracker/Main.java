import java.util.Scanner;

import Services.WalletService;
import Models.Account;
import Models.SavingsAcc;
import Models.CurrentAcc;

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
                    System.out.print("Enter Account Number: ");
                    int accNum = Integer.parseInt(sc.next().trim());
                    System.out.print("Enter Password: ");
                    String verifyPassword = sc.next().trim();
                    boolean found = false;
                    Account loggedInAccount = null;

                    for (Account acc : walletService.getAccounts()) {
                        if (acc.getAccountNum() == accNum && acc.getPassword().equals(verifyPassword)) {
                            System.out.println("\nLogin successful! Welcome, " + acc.getName() + ".");
                            found = true;
                            loggedInAccount = acc; // Store logged-in account number

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Invalid account number or password. Please try again.");
                        break;
                    }

                    // If login is successful, show account menu
                    else {
                        System.out.println("\t----- Welcome to your account -----");
                        while (true) {
                            System.out.println("\t1. View Account Details");
                            System.out.println("\t2. Deposit Money");
                            System.out.println("\t3. Withdraw Money");
                            System.out.println("\t4. View Transaction History");
                            System.out.println("\t5. Transfer Money");
                            System.out.println("\t6. Logout");
                            System.out.print("\tEnter your choice: ");
                            String choice = sc.next().trim().toLowerCase();

                            if (choice.equals("6")) {
                                System.out.println("Logging out...");
                                break; 
                            }

                            switch (choice) {
                                case "1":
                                    System.out.println("Displaying account details...");
                                    loggedInAccount.displayAccDetails();
                                    
                                    break;
                                case "2":
                                    System.out.print("Enter the amount to deposit: ");
                                    double depositAmount = Double.parseDouble(sc.next().trim());
                                    walletService.DepositMoney(loggedInAccount, depositAmount);
                                    
                                    sc.nextLine(); // Consume the newline character
                                    break;
                                case "3":
                                    System.out.print("Enter the amount to withdraw: ");
                                    double withdrawAmount = Double.parseDouble(sc.next().trim());
                                    walletService.WithdrawMoney(loggedInAccount, withdrawAmount);

                                    sc.nextLine(); // Consume the newline character
                                    break;
                                case "4":
                                    System.out.println("Viewing transaction history...");
                                    // Add logic to view transaction history
                                    break;
                                case "5":
                                    System.out.println("Transferring money...");
                                    // Add logic to transfer money
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                            }
                        }
                    }
                    sc.nextLine(); // Consume the newline character

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
                    System.out.print("Enter Account Number to Delete : ");
                    int delAccNum = Integer.parseInt(sc.next().trim());
                    System.out.print("Enter Password : ");
                    String delPassword = sc.next().trim();
                    Account toDelete = null;

                    for (Account acc : walletService.getAccounts()){
                        if (acc.getAccountNum() == delAccNum && acc.getPassword().equals(delPassword)){
                            toDelete = acc;
                            break;
                        }
                    }
                    
                    if (toDelete != null){
                        walletService.getAccounts().remove(toDelete);
                        System.out.println("Account Has been Successfully deleted !");
                    }
                    else{
                        System.out.println("Invalid Account Number or Password, Please try Again !");
                    }

                    sc.nextLine(); // Consume the next line
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close(); 
    }
}
