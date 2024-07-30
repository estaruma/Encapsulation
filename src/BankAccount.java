public class BankAccount {

    // private instance variables

    private String accountNumber;

    private double balance;


    // initialise account number & balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    //setter method for account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // getter method for balance

    public double getBalance() {
        return balance;
    }

    //setter method for balance

    public void setBalance(double balance) {
        this.balance = balance;
    }




}
