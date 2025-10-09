package Models;

public abstract class Account{

    private int accountNum;
    private String name;
    private String password;
    private double balance;

    public Account(int accountNum, String name, String password, double balance){
        this.accountNum = accountNum;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public int getAccountNum() {
        return accountNum;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public double getBalance() {
        return balance;
    }

    public void displayAccDetails(){
        System.out.println("Account Number : "+accountNum);
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
    }

}