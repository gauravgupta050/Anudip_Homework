public class BankAccount {
   
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("New balance : " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("New balance : " + balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Gaurav", 1000000.00);
        account.displayAccountDetails();
        System.out.println();
        System.out.println("Deposit Money ----");
        account.deposit(500000.00);
        System.out.println();
        System.out.println("Withdraw Money ----");
        account.withdraw(200000.00);
        System.out.println();
        account.displayAccountDetails();
    }
}
