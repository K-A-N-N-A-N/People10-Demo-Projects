package Services;

import Models.*;
import java.util.ArrayList;
import java.util.List;

public class WalletService {
    private List<Account> accounts = new ArrayList<>();
    private int nextAccountNum = 1001;

    public void CreateAcc(String accType, String name, String password, double balance) {
        Account newAccount;

        if (accType.toLowerCase().equals("savings")) {
            newAccount = new SavingsAcc(nextAccountNum++, name, password, balance);
        } else if (accType.toLowerCase().equals("current")) {
            newAccount = new CurrentAcc(nextAccountNum++, name, password, balance);
        } else {
            System.out.println("Invalid account type. Please choose 'savings' or 'current'.");
            return;
        }

        accounts.add(newAccount);
        System.out.println("Account created successfully! Here are the details:");
        System.out.println("---------------------------------------------------");
        newAccount.displayAccDetails();
        System.out.println("---------------------------------------------------");
    }

    public List <Account> getAccounts() {
        return accounts;
    }


    public void DepositMoney(Account acc, double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        double newBalance = acc.getBalance() + amount;
        acc.setBalance(newBalance);
        System.out.println("Deposit successful!");
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + newBalance);
    }

    public void WithdrawMoney(Account acc, double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > acc.getBalance()) {
            System.out.println("Insufficient balance for this withdrawal.");
            return;
        }
        double newBalance = acc.getBalance() - amount;  
        acc.setBalance(newBalance);
        System.out.println("Withdrawal successful!");
        System.out.println("Withdrawn: " + amount);
        System.out.println("New Balance: " + newBalance);
    }

}