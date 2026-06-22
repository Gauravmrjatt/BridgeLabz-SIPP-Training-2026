public class BankSystem {
    static String bankName = "National Bank";
    static int totalAccounts = 0;

    final String accountNumber;
    String accountHolderName;
    double balance;

    public BankSystem(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankSystem) {
            System.out.println("Bank: " + bankName);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Account: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        BankSystem acc1 = new BankSystem("Alice", "ACC001", 5000);
        BankSystem acc2 = new BankSystem("Bob", "ACC002", 3000);
        acc1.displayDetails();
        acc2.displayDetails();
        getTotalAccounts();
    }
}
