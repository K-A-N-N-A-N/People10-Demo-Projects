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
        System.out.println("\nAccount Number : "+accountNum);
        System.out.println("\nName : "+name);
        System.out.println("\nBalance : "+balance);
    }

}