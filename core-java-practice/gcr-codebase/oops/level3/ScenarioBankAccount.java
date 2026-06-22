import java.util.ArrayList;

public class ScenarioBankAccount {
    static int totalAccounts = 0;

    final String accountNumber;
    String holder;
    double balance;
    ArrayList<String> statement;

    public ScenarioBankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        this.statement = new ArrayList<>();
        statement.add("Account created with balance: $" + balance);
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        statement.add("Deposited: $" + amount);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            statement.add("Failed withdrawal: $" + amount + " (insufficient funds)");
            return false;
        }
        balance -= amount;
        statement.add("Withdrew: $" + amount);
        return true;
    }

    public ArrayList<String> getStatement() {
        return new ArrayList<>(statement);
    }

    public void displayBalance() {
        System.out.println(holder + " (" + accountNumber + "): $" + balance);
    }

    public static void main(String[] args) {
        ScenarioBankAccount a1 = new ScenarioBankAccount("ACC001", "Alice", 1000);
        ScenarioBankAccount a2 = new ScenarioBankAccount("ACC002", "Bob", 500);
        ScenarioBankAccount a3 = new ScenarioBankAccount("ACC003", "Charlie", 2000);

        a1.deposit(500);
        a1.withdraw(200);
        a1.withdraw(2000);
        a1.deposit(300);

        a2.deposit(100);
        a2.withdraw(700);
        a2.withdraw(50);
        a2.deposit(200);

        a3.withdraw(500);
        a3.deposit(1000);
        a3.withdraw(300);
        a3.withdraw(2500);
        a3.deposit(100);

        ScenarioBankAccount[] accounts = {a1, a2, a3};
        for (ScenarioBankAccount acc : accounts) {
            acc.displayBalance();
            System.out.println("Statement: " + acc.getStatement());
            System.out.println();
        }
        System.out.println("Total accounts created: " + totalAccounts);
    }
}
