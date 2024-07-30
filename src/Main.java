public class Main {
    public static void main(String[] args) {

        BankAccount bankaccount = new BankAccount("123456", 500);

        System.out.println("Bank Account number " + bankaccount.getAccountNumber());
        System.out.println("Bank Account balance " + bankaccount.getBalance());

    }
}